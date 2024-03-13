package com.example.DAWIl_EF_TipoQuispeJesusAlberto.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.jwt.JwtService;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.UserRepo;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepo userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        try {
            System.out.println("Iniciando proceso de autenticación para el usuario: " + request.getUsername());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails user = userRepository.findByUsername(request.getUsername()).orElseThrow(() -> new UsernameNotFoundException("User not found"));
            if (!user.isEnabled()) {
                System.out.println("Error: La cuenta del usuario está bloqueada: " + request.getUsername());
                throw new LockedException("User account is locked");
            }  
            String token = jwtService.getToken(user);
            
            System.out.println("Token JWT generado para el usuario: " + request.getUsername());
            
            return AuthResponse.builder().token(token).build();
        } catch (Exception e) {
        	
            System.err.println("Error durante la autenticación para el usuario: " + request.getUsername());
            
            e.printStackTrace();
            throw e;
        }
    }
    
    public AuthResponse register(UserRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .name(request.getName())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .is_active(request.getIs_active())
                .kind(request.getKind())
                .created_at(request.getCreated_at())
                .build();

        userRepository.save(user);
        String token = jwtService.getToken(user);
        return AuthResponse.builder().token(token).build();
    }

    public AuthResponse updateUser(int id, UserRequest request) {
        User userToUpdate = userRepository.findById(id).orElseThrow();

        userToUpdate.setUsername(request.getUsername());
        userToUpdate.setName(request.getName());
        userToUpdate.setLastname(request.getLastname());
        userToUpdate.setEmail(request.getEmail());

        String newPassword = passwordEncoder.encode(request.getPassword());
        userToUpdate.setPassword(newPassword);

        userToUpdate.setIs_active(request.getIs_active());
        userToUpdate.setKind(request.getKind());
        userToUpdate.setCreated_at(request.getCreated_at());
        userRepository.save(userToUpdate);

        String token = jwtService.getToken(userToUpdate);
        return AuthResponse.builder().token(token).build();
    }
    
      
}

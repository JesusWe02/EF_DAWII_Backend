package com.example.DAWIl_EF_TipoQuispeJesusAlberto.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody UserRequest request)
    {
        return ResponseEntity.ok(authService.register(request));
    }
    
    @PutMapping("/updateUser/{id}")
    public ResponseEntity<AuthResponse> updateUser(@PathVariable("id") int id, @RequestBody UserRequest request) {
        AuthResponse response = authService.updateUser(id, request);
        return ResponseEntity.ok(response);
    }

}

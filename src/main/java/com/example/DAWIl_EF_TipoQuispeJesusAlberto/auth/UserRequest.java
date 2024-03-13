package com.example.DAWIl_EF_TipoQuispeJesusAlberto.auth;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    String username;
    String name;
    String lastname;
    String email;
    String password;
    Boolean is_active;
    int kind;
    LocalDate created_at;
 
}


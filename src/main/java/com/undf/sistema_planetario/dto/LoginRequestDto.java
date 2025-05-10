package com.undf.sistema_planetario.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginRequestDto {
    private final String email;
    private final String password;
}

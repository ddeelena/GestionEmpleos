package edu.co.sistemagestionempleos.Auth;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResponse {
    private String token ;
    private String role ;
}

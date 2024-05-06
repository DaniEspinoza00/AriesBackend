package com.ariesbookshop.apirest.Users.Auth;

import com.ariesbookshop.apirest.Users.User.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    String token;
    User user;
}

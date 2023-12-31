package com.thProject.myChef.web.dto.auth;

import com.thProject.myChef.domain.user.User;
import lombok.Data;


@Data
public class SignupDto {
    private String username;
    private String password;
    private String email;
    private String name;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}

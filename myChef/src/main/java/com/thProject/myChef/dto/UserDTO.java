package com.thProject.myChef.dto;

import com.thProject.myChef.entity.UserEntity;
import lombok.Data;

@Data
public class UserDTO {

    private String id;
    private String password;
    private String email;
    private String name;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .userId(id)
                .userPw(password)
                .userEmail(email)
                .userName(name)
                .build();
    }
}

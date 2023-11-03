package com.thProject.myChef.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER_INFO")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    private String userId;
    private String userPw;
    private String userEmail;
    private String userName;

    @Builder
    public UserEntity(
            String userId,
            String userPw,
            String userEmail,
            String userName){
        this.userId = userId;
        this.userPw = userPw;
        this.userEmail = userEmail;
        this.userName = userName;
    }
}

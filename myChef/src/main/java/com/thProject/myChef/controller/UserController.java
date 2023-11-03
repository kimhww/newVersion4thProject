package com.thProject.myChef.controller;

import com.thProject.myChef.dto.UserDTO;
import com.thProject.myChef.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/save")
    public String saveUser(UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
}

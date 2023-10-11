package com.thProject.myChef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}

package com.thProject.myChef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String initial(){
        return "index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}

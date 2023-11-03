package com.thProject.myChef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/")
    public String index1() { return "/index"; }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/join")
    public String join() {
        return"/join";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }
}

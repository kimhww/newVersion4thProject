package com.thProject.myChef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/")
    public String index1() {
        return "/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    @RequestMapping("/addrestaurant")
    public String addrestaurant() {
        return "/addrestaurant";
    }

    @RequestMapping("/addrestaurantfunction")
    public String addrestaurantfunction() {
        return "/addrestaurantfunction";
    }

    @RequestMapping("/addrestaurantplace")
    public String addrestaurantplace() {
        return "/addrestaurantplace";
    }

    @RequestMapping("/addrecipe")
    public String addrecipe() {
        return "/addrecipe";
    }

    @RequestMapping("/addrecipefunction")
    public String addrecipefunction() {
        return "/addrecipefunction";
    }

    @RequestMapping("/addrecipeplace")
    public String addrecipeplace() {
        return "/addrecipeplace";
    }
}

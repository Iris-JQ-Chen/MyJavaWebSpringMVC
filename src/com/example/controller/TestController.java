package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Test")
public class TestController {

    @RequestMapping("/say")
    public String say(Model model){
        model.addAttribute("name","hhh!");
        return "say";
    }

}

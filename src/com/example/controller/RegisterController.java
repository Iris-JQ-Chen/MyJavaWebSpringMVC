package com.example.controller;

import com.example.logic.RegisterCheck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Model model, HttpServletRequest request, HttpServletResponse response){
        model.addAttribute("method","POST");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String age = request.getParameter("age");

        if(RegisterCheck.registerCheck(username, password,age)){
            model.addAttribute("username", username);
            return "login";
        }else{
            return "register";
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("method","GET");
        return "register";
    }

}

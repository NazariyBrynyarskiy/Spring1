package com.BlokWe.spring3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @GetMapping("Account")
    public String shop (Model model){
        return "Account";
    }
}

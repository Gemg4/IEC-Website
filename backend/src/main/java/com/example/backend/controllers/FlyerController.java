package com.example.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlyerController
{
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}

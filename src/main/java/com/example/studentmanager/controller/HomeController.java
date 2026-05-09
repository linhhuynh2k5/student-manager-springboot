package com.example.studentmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/students")
    public String students() {
        return "students";
    }

    @GetMapping("/tuition")
    public String tuition() {
        return "tuition";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
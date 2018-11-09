package com.springissues.issuetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping
    public String getHello() {
        return "hello";
    }
}

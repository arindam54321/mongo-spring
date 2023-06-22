package com.mongo.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String homePage() {
        return "<a href='/home'>Home Page</a>";
    }

}

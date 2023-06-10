package com.mongo.db.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController implements ErrorController {
    @GetMapping({"/", "/home"})
    public String homePage(Model model) {
        return "home";
    }

    @GetMapping("/error")
    public String errorPage() {
        return "error";
    }
}

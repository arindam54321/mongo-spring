package com.mongo.db.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPage implements ErrorController {

    @GetMapping("/error")
    public String errorPage() {
        return """
                 <div class="view">
                    <div class="pages">
                        <h3>Unexpected Error Occurred</h3>
                        <a href="/home">Go back to home page</a>
                    </div>
                </div>""".indent(4);
    }
}

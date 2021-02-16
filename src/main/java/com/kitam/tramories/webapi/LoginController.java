package com.kitam.tramories.webapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping(path = "loginForm")
    String loginForm() {
        return "loginForm.html";
    }
}
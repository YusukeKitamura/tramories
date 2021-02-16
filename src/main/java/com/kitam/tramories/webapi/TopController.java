package com.kitam.tramories.webapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
    @GetMapping(path = "top")
    String loginForm() {
        return "top.html";
    }

}

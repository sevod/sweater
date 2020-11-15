package org.sevod.sweater.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/")
    public String greeting(Map<String, Object> model)
    {
        return "home";
    }
}

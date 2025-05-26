package com.example.immigrantrights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ImmigrantrightsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmigrantrightsApplication.class, args);
    }

    @GetMapping("/") // This means: show this when user visits "/"
    public String home() {
        return "index"; // Loads templates/index.html
    }

    @GetMapping("/about") // When user visits "/about"
    public String about() {
        return "about"; // Loads templates/about.html
    }

    @GetMapping("/rights")
    public String rights() {
        return "rights";
    }

    @GetMapping("/report")
    public String report() {
        return "report";
    }

    @GetMapping("/help")
    public String help() {
        return "help";
    }
}
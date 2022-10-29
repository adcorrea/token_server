package com.adcorreajr.token_server.rest.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping
    public String hello(Authentication authentication) {
        return "Hello, " + authentication.getName() + "!";
    }
}

package com.Oauth2.SpringOauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
     
    @GetMapping("/")
    public String hello() {
        return "Hello, You are Logged in!";
    }
      
}

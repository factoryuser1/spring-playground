package com.spring.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello Spring Ammar Test 2";
    }

    @PostMapping("/messages")
    public String helloWorldPost() {
        return "POST to messages route";
    }
}

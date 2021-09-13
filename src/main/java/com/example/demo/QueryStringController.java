package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class QueryStringController {

    @GetMapping("/foo")
    public String getFoo() {
        return "foo";
    }

    @GetMapping("/bar")
    public String getBar(){
        return "bar";
    }
}

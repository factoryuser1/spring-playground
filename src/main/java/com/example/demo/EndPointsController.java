package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointsController {

    @GetMapping("/routes")
    public String getIndex(){
        return "GET to index route";
    }

    @RequestMapping("/")
    public String ignoreMapping(){
        return "Ignore the routes: GET and POST";
    }

    @GetMapping("/tasks")
    public String getTasks(){
        return "These are tasks";
    }

    @PostMapping("/posts")
    public String createTask(){
        return "You just POSTed to /tasks";
    }
}

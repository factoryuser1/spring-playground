package com.spring.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts/{postId}/comments")
public class CommentsController {
//    @GetMapping("/")
//    public String[] getComments(@PathVariable int postId){
//        return ""[];
//    }
}

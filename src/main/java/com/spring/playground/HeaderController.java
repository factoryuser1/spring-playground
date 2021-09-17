package com.spring.playground;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HeaderController {

    @GetMapping("/header")
    public String getHeaderValue(@RequestHeader String host){
        return host;
    }

    @PostMapping("/posts/{postId}/comments")
    public String createComment(@PathVariable("postId") int postId, @RequestParam Map<String , String> params){
        return String.format(
                "postId:%d notify:%s content:%s author:%s",
                postId,
                params.get("notify"),
                params.get("content"),
                params.get("authoer")
        );
    }
}

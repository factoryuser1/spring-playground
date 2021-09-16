package com.spring.playground;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {
    @GetMapping("/cooke")
    public String getCookie(@CookieValue(name = "foo") String cookie){
        return cookie;
    }

}

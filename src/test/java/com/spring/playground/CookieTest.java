package com.spring.playground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.servlet.http.Cookie;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class CookieTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testCookieHeader() throws Exception{
        this.mvc.perform(get("/cooke").cookie(new Cookie("foo", "bar")))
                .andExpect(status().isOk())
                .andExpect(content().string("bar"));
    }

}

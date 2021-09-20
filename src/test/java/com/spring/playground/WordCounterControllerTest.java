package com.spring.playground;

import com.spring.playground.WordCounterController;
import com.spring.playground.WordCounterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest(classes = WordCounterController.class)
@AutoConfigureMockMvc
//@WebMvcTest(WordCounterController.class)
public class WordCounterControllerTest {

    @MockBean
    WordCounterService wordCounterService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void getJsonWordCount() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.post("/words/count")
                .content("A brown cow jumps over a brown fox")
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.TEXT_PLAIN);
        when(wordCounterService.count("A brown cow jumps over a brown fox")).thenReturn(new HashMap<String, Integer>());

        this.mvc.perform(request)
                .andExpect(status().isOk());

    }

}

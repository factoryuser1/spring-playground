package com.wordCount;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WordCounterController.class)
//@SpringBootTest
public class WordCounterControllerTest {
//
//    @MockBean
//    WordCounterService wordCounterService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void getJsonWordCount() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.post("/words/count")
                .content("A brown cow jumps over a brown fox")
                .contentType(MediaType.TEXT_PLAIN);
        this.mvc.perform(request)
                .andExpect(status().isOk());

    }

}

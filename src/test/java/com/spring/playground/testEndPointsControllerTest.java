package com.spring.playground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EndPointsController.class)
public class testEndPointsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void
    testIndexEndpoint() throws Exception {
        this.mvc.perform(get("/vehicles?year=1987&doors=2"))
                .andExpect(status().isOk());
    }
}

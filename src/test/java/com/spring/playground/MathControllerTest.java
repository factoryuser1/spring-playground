package com.spring.playground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void calculateAcceptsOperatorAndTwoNumbers() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operator=add&x=4&y=6");
        this.mvc.perform(request)
                .andExpect(status().isOk());
    }

    @Test
    public void calculateReturnsSumWhenCalledWithAdd() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operator=add&x=4&y=6");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("4 + 6 = 10"));
    }

    @Test
    public void calculateReturnsProductWhenCalledWithMultiply() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operator=multiply&x=4&y=6");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("4 * 6 = 24"));
    }
    @Test
    public void calculateReturnsDifferenceWhenCalledWithSubtract() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operator=subtract&x=4&y=6");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("4 - 6 = -2"));
    }
    @Test
    public void calculateReturnsQuotientWhenCalledWithDivide() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operator=divide&x=30&y=5");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("30 / 5 = 6"));
    }
    @Test
    public void calculateReturnsSumWhenCalledWithNoOperator() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?x=30&y=5");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("30 + 5 = 35"));
    }
    @Test
    public void sumReturnsSumEquationAsString() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.post("/math/sum?n=4&n=5&n=6");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("4 + 5 + 6 = 15"));
    }

}

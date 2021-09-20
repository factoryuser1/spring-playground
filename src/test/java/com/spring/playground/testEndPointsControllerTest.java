package com.spring.playground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EndPointsController.class)
public class testEndPointsControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    public void
//    testIndexEndpoint() throws Exception {
//        this.mvc.perform(get("/vehicles?year=1987&doors=2"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void testIndexEndPointVehicle() throws Exception{
//        //use String concatentation / string formatting to insert dynamic path segments to send as a request
//        int driverId = 4;
//
//        this.mvc.perform(get(String.format("/drivers/%d/trips", driverId)))
//                .andExpect(status().isOk());
//    }
//    @Test
//    public void testURLEncoderPostMethod() throws Exception{
//        MockHttpServletRequestBuilder request = post("/comments")
//                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                .param("content", "Firsties!")
//                .param("Author", "Dwayne");
//    }

}

package com.springboot.finapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = com.springboot.finapp.controller.HelloController.class)
@AutoConfigureMockMvc
class FinappApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloControllerReturnsOkStatus() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk());
    }
}

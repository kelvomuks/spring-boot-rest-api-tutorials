package com.kelvo.demoreactcrud;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith( SpringExtension.class)
class DemoReactCrudApplicationTests {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    void contextLoads() {
//    }

    @Test
    public void getsAllRides() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/tutorials")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
    @Test
    public void getsSingleRide() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/tutorials/2")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

}

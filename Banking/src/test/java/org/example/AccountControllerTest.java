package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.hibernate.validator.constraints.Length;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

public class AccountControllerTest {
    private static final ObjectMapper om = new ObjectMapper();
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void init() {
    }

    @Test
    public void getAccounts_OK() throws Exception {

        mockMvc.perform(get("/accounts/{id}").header(HttpHeaders.AUTHORIZATION,
                "Basic " + Base64Utils.encodeToString("admin:nimde".getBytes())))
                .andExpect(status().isOk())
                .andExpect(content().string("Return accounts"));
    }

    @Test
    public void getStandingOrders_OK() throws Exception {

        mockMvc.perform(get("/accounts/{id}").header(HttpHeaders.AUTHORIZATION,
                "Basic " + Base64Utils.encodeToString("admin:nimde".getBytes())))
                .andExpect(status().isOk())
                .andExpect(content().string("Return accounts"));
    }

    @Test
    public void deleteStandingOrder_OK() throws Exception {
        mockMvc.perform(get("/accounts").header(HttpHeaders.AUTHORIZATION,
                "Basic " + Base64Utils.encodeToString("admin:nimde".getBytes())))
                .andExpect(status().isCreated())
                .andExpect(content().string("delete standing order"));
    }

    @Test
    public void getBalance_OK() throws Exception {

        mockMvc.perform(get("/airports/").header(HttpHeaders.AUTHORIZATION,
                "Basic " + Base64Utils.encodeToString("admin:nimde".getBytes())))
                .andExpect(status().isNoContent())
                .andExpect(content().string("return balance"));
    }



  }
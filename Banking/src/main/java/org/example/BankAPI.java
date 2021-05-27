package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class BankAPI {


        @GetMapping(value = {"/accounts"})
        @ResponseStatus(HttpStatus.CREATED)
        public String getAccount() {
                return ("accounts");
        }
        @GetMapping("/accounts/standingOrders")
        @ResponseStatus(HttpStatus.CREATED)
        public String getStandingOrders() {
                return ("Standing order: Mustafa");
        }

        @DeleteMapping("/accounts/deleteStandingOrder")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public String deleteStandingOrder() {
                return ("Standing order deleted");
        }

        @GetMapping("/accounts/balance")
        @ResponseStatus(HttpStatus.CREATED)
        public String getBalance() {
                return ("£10000.00");
        }

}
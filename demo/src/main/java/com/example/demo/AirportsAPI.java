package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportsAPI {

    @GetMapping(value = {"/globalDirectory"})
    public String globalDirectory() {
        return("hello");

    }


    @PostMapping(value={"/goodbye"})
   public String sayGoodBye() {
      return("goodbye from Spring boot!");
    }
}

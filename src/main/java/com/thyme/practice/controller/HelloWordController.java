package com.thyme.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWordController {

	
	@GetMapping("/Hello")
    private String getEmployeeDetails() {
       
        return "Hello Word";
    }
}

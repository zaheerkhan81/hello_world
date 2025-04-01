package com.thyme.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class HelloWordController {

	
	@GetMapping("/Hello")
    private String getEmployeeDetails() {
		return "Hello Word";
    }
	
	@RequestMapping("/home")
    public String gethome(Model model) {
       
    	model.addAttribute("message", "Welcome to Spring Boot with JSP!");
	        return "home"; // home.jsp
    }
}

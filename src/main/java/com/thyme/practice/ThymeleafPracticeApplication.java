package com.thyme.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafPracticeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println(" INSIDE MAIN METHOD");

		SpringApplication.run(ThymeleafPracticeApplication.class, args);
		
		
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println(" INSIDE MAIN METHOD BUILD");

		return builder.sources(ThymeleafPracticeApplication.class);
	}
	
}
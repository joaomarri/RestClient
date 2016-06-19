package com.component.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config-test.properties") 
public class TestConfigSpring{
	
	public static void main(String[] args) {
		SpringApplication.run(TestConfigSpring.class, args);
	}
	
}

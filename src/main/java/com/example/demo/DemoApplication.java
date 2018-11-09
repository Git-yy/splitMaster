package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String test(){

		return  "Hello td 123";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

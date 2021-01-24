package com.rkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springdockeraws1Application {

	@RequestMapping("/")
	public String home()
	{
		return "Welcome To Spring Boot App...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Springdockeraws1Application.class, args);
		System.out.println("Hi Raosaheb.....");
	}

}

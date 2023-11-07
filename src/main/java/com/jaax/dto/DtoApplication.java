package com.jaax.dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtoApplication.class, args);
	}

	@RequestMapping("/api")
	public String helloWorld(){
		return "Hola mundo";
	}
}

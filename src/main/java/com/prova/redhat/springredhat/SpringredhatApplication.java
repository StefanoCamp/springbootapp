package com.prova.redhat.springredhat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringredhatApplication {

	@GetMapping("/")
	public String getMessage() {
		return "OpenShift!";
	}
	
	@PostMapping("/{input}")
	public String getMessage(@PathVariable("input") String input) {
		return "Input is : " + input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringredhatApplication.class, args);
	}

}

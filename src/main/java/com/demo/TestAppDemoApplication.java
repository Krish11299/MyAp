package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestAppDemoApplication {

	@GetMapping("/")
	public String getMessage() {
		return "hello getMessage method is called.. app deployed";
	}
	@PostMapping("/{name}")
	public String message(@PathVariable String name) {
		return "Your name is"+name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestAppDemoApplication.class, args);
		
		
	}

}

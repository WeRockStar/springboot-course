package com.sprint3r.deans4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootMavenProjectApplication {

	@GetMapping("/")
	public String hello() {
<<<<<<< HEAD
		return "Hello Spring boot by P'Dean";
=======
		return "Hello";
>>>>>>> Update README.md
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenProjectApplication.class, args);
	}
}

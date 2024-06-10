package com.tka.firstsbproject177;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class Firstsbproject177Application {
	public static void main(String[] args) {
		SpringApplication.run(Firstsbproject177Application.class, args);
	}
}

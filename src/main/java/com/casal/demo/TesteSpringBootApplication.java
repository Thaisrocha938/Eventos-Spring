package com.casal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.casal.controllers"})
@EntityScan(basePackages = { "com.casal.models" })
public class TesteSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSpringBootApplication.class, args);
	}

}

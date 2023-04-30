package com.example.injectionpoint;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootInjectionpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInjectionpointApplication.class, args);
	}

	@Bean
	public CommandLineRunner loggingRunner(Logger logger) {
		return args -> logger.info("running logging runner");
	}
}

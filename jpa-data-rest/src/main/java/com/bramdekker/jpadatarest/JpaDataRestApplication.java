package com.bramdekker.jpadatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDataRestApplication.class, args);
	}

	@Bean
	PersonProcessor personProcessor() {
		return new PersonProcessor();
	}

}

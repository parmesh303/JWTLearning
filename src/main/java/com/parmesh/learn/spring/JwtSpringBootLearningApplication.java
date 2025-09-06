package com.parmesh.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JwtSpringBootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringBootLearningApplication.class, args);
	}

}

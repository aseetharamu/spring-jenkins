package com.demo.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	
	public static final Logger log = LoggerFactory.getLogger(Application.class);

	@PostConstruct
	public void init() {
		log.info("Application Started...");
		log.info("Testing pipeline in jenkins...");
	
	}
	public static void main(String[] args) {
		log.info("Application executed ");
		SpringApplication.run(Application.class, args);
	}

}

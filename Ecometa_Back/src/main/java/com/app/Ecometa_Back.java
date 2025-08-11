package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync 
public class Ecometa_Back {

	public static void main(String[] args) {
		SpringApplication.run(Ecometa_Back.class, args);
	}

}

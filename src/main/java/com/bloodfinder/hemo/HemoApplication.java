package com.bloodfinder.hemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bloodfinder.hemo")
public class HemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HemoApplication.class, args);
	}
}

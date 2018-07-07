package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		//The below line starts the Application.
		System.out.println("Hello World !!");
		System.out.println("Yes Guru !!");		
		SpringApplication.run(SpringStarterProjectApplication.class, args);
	}
}

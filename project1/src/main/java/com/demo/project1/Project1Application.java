package com.demo.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
		System.out.println("This is my java project");
		System.out.println("Hello everyone");
		System.out.println("Demo project to understand jenkins pipeline");
	}

}

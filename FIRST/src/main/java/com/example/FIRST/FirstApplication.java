package com.example.FIRST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication{

	public static void main(String[] args) {
		
		SpringApplication.run(FirstApplication.class, args);
		
		A a=new Game1();
		
		Runner r=new Runner(a);
		r.run();
		
		
		
		
	}
}
 

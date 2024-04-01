package com.example.cartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CartServiceApplication.class, args);
	}
	//run the spring app on intellij terminal -  ./mvnw spring-boot:run
	//                       OR
	//run the generated jar (generated with  maven) in your terminal-  java -jar target/rest-service-0.1.0-SNAPSHOT.jar

}

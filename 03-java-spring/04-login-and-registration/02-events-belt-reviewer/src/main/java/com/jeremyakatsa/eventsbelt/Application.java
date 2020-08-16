package com.jeremyakatsa.eventsbelt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.eventsbelt.repositories"})
@ComponentScan({"com.jeremyakatsa.eventsbelt.controllers"})
@ComponentScan({"com.jeremyakatsa.eventsbelt.models"})
@ComponentScan({"com.jeremyakatsa.eventsbelt.services"})
@ComponentScan({"com.jeremyakatsa.eventsbelt.validators"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

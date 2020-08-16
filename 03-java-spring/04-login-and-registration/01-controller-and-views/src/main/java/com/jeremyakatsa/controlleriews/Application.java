package com.jeremyakatsa.controlleriews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.controlleriews.repositories"})
@ComponentScan({"com.jeremyakatsa.controlleriews.controllers"})
@ComponentScan({"com.jeremyakatsa.controlleriews.models"})
@ComponentScan({"com.jeremyakatsa.controlleriews.services"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

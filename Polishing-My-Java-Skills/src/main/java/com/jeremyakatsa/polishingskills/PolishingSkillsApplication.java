package com.jeremyakatsa.polishingskills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jeremyakatsa.polishingskills.repositories"})
@ComponentScan({"com.jeremyakatsa.polishingskills.controllers"})
@ComponentScan({"com.jeremyakatsa.polishingskills.models"})
@ComponentScan({"com.jeremyakatsa.polishingskills.services"})
@ComponentScan({"com.jeremyakatsa.polishingskills.validators"})
@SpringBootApplication
public class PolishingSkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolishingSkillsApplication.class, args);
	}

}

package com.jeremyakatsa.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	
	@RequestMapping("/coding")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String codingPython() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String codingJava() {
		return "Java/Spring is better!";
	}

}

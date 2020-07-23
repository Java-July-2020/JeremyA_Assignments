package com.jeremyakatsa.codingcontroller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
	public String javaSpring() {
		return "Java/Spring is better!";
	}

}

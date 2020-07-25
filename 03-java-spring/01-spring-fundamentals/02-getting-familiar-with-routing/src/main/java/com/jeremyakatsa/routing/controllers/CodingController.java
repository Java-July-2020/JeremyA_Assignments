package com.jeremyakatsa.routing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodingController {
	
	@RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("dojoName", "Burbank");
        return "index.jsp";
    }
	
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

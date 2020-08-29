package com.jeremyakatsa.polishingskills.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jeremyakatsa.polishingskills.models.User;
import com.jeremyakatsa.polishingskills.services.UserService;
import com.jeremyakatsa.polishingskills.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService uService;
	@Autowired
	private UserValidator validator;
	
	
	@RequestMapping("/")
	public String Index(@ModelAttribute("user") User user) {
	    return "/Users/index.jsp";
	}
	
	@PostMapping("/")
	public String Register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "/Users/index.jsp";
			}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("userId", newUser.getId());
		return "redirect:/courses";
	}
	
	
	@PostMapping("/login")
	public String Login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirs) {
		if(this.uService.authenticateUser(email, password)) {
			User user = this.uService.getUserByEmail(email);
			session.setAttribute("userId", user.getId());
			return "/Courses/index.jsp";
		}
		redirs.addFlashAttribute("error", "Invalid Email/Password Match");
		return "redirect:/";
	}
        
}

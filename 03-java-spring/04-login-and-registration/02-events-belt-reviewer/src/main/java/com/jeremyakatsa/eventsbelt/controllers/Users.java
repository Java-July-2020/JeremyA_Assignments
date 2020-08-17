package com.jeremyakatsa.eventsbelt.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jeremyakatsa.eventsbelt.models.User;
import com.jeremyakatsa.eventsbelt.services.UserService;
import com.jeremyakatsa.eventsbelt.validators.UserValidator;

@Controller
public class Users {
	
	private final UserService userService;
	private final UserValidator userValidator;

	public Users(UserService userService, UserValidator userValidator) {
	    this.userService = userService;
	    this.userValidator = userValidator;
	}
	
	@RequestMapping("/")
	public String registerForm(@ModelAttribute("user") User user) {
	    return "index.jsp";
	}
	@RequestMapping("/")
	public String login() {
	    return "index.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			// if result has errors, return the registration page (don't worry about validations just now)
			return "index.jsp";
		}
		User u = this.userService.registerUser(user);
		session.setAttribute("user_id", u.getId());
		return "events.jsp";
	    // else, save the user in the database, save the user id in session, and redirect them to the /home route
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, 
			RedirectAttributes redirectAt, 
			Model model, HttpSession session) {
	    // if the user is authenticated, save their user id in session
		if(this.userService.authenticateUser(email, password)) {
			User u = this.userService.findByEmail(email);
			session.setAttribute("user_id", u.getId());
			return "events.jsp";
		} else {
			model.addAttribute("loginError", "Invalid Credentials, please try again.");
			return "index.jsp";
		    // else, add error messages and return the login page
		}
	}
	
	@RequestMapping("/events")
	public String home(HttpSession session, Model model) {
		Long userId = (Long)session.getAttribute("user_id");
		User u = this.userService.findUserById(userId);
		model.addAttribute("user", u);
		return "events.jsp";
	    // get user from session, save them in the model and return the home page
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	    // invalidate session
		session.invalidate();
		// redirect to login page
		return "redirect:/";
	}
}
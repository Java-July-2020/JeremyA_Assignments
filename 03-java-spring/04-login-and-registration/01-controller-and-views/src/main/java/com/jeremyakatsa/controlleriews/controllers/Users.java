package com.jeremyakatsa.controlleriews.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jeremyakatsa.controlleriews.models.User;
import com.jeremyakatsa.controlleriews.services.UserService;

public class Users {
	
	private final UserService userService;

	public Users(UserService userService) {
	    this.userService = userService;
	}
	
	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
	    return "registrationPage.jsp";
	}
	@RequestMapping("/login")
	public String login() {
	    return "loginPage.jsp";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			// if result has errors, return the registration page (don't worry about validations just now)
			return "registrationPage.jsp";
		}
		User user = this.userService.registerUser(user);
		session.setAttribute("user_id", user.getId());
		return "redirect:/home";
	    // else, save the user in the database, save the user id in session, and redirect them to the /home route
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, 
			RedirectAttributes redirectAt, 
			Model model, HttpSession session) {
	    // if the user is authenticated, save their user id in session
		if(this.userService.authenticateUser(email, password)) {
			User user = this.userService.findByEmail(email);
			session.setAttribute("user_id", user.getId());
			return "homePage.jsp";
		}
		redirectAt.addFlashAttribute("loginError", "Invalid Credentials");
		return "redirect:/login";
	    // else, add error messages and return the login page
	}
	
	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		Long userID = (Long)session.getAttribute("user_id");
		User user = this.uService.findAUser(userID);
		if(userID == null) {
			return "redirect:/";
	    // get user from session, save them in the model and return the home page
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	    // invalidate session
		session.invalidate();
		// redirect to login page
		return "redirect:/login";
	}
}

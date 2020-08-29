package com.jeremyakatsa.polishingskills.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeremyakatsa.polishingskills.models.Course;
import com.jeremyakatsa.polishingskills.models.User;
import com.jeremyakatsa.polishingskills.services.CourseService;
import com.jeremyakatsa.polishingskills.services.UserService;

@Controller
@RequestMapping ("/courses")
public class CourseController {
	@Autowired
	private UserService uService;
	@Autowired
	private CourseService cService;
	
	public Long userSessionId(HttpSession session) {
		if(session.getAttribute("userId") == null)
			return null;
		return (Long)session.getAttribute("userId");
	}
	
	@GetMapping("")
	public String Index(@ModelAttribute("course") Course course, Model model, HttpSession session) {
		Long userId = this.userSessionId(session);
		if(userId == null)
			return "redirect:/";
		User user = this.uService.findById(userId);
		model.addAttribute("userCourses", this.cService.findById(userId));
		model.addAttribute("user", user);
		return "/Courses/index.jsp";
	}
	@PostMapping("")
	public String Create(@Valid @ModelAttribute("newCourse") Course course, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
		if(result.hasErrors()) {
			Long userId = this.userSessionId(session);
			User user = this.uService.findById(userId);
			model.addAttribute("userCourses", this.cService.findById(userId));
			model.addAttribute("user", user);
			return "/Courses/index.jsp";
		}
		this.cService.create(course);
		return "redirect:/courses";
	}
	
	@GetMapping("{id}")
	public String Show(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = this.userSessionId(session);
		Course course  = this.cService.findById(id);
		if(userId == null)
			return "redirect:/";
		if(course == null)
			return "redirect:/";
		model.addAttribute("course", course);
		model.addAttribute("userId", userId);
		return "/Courses/show.jsp";
	}

	@GetMapping("{id}/edit")
	public String Edit(@PathVariable("id") Long id, HttpSession session, Model model) {
		Long userId = this.userSessionId(session);
		Course course = this.cService.findById(id);
		if(userId == null)
			return "redirect:/courses";
		model.addAttribute("course", course);
		model.addAttribute("userId", userId);
		return "/Courses/edit.jsp";
	}
	@PutMapping("{id}")
	public String Update(@Valid @ModelAttribute("course") Course course, BindingResult result, @PathVariable("id") Long id, HttpSession session, Model model) {
		if(result.hasErrors()) {
			Long userId = this.userSessionId(session);
			model.addAttribute("course", course);
			model.addAttribute("userId", userId);
			return "/Courses/edit.jsp";
		}
		this.cService.update(course);
		return "redirect:/courses";
	}
	@DeleteMapping("{id}")
	public String Delete(@PathVariable("id") Long id) {
		this.cService.delete(id);
		return "redirect:/courses";
	}
	@GetMapping("{id}/a/{choice}")
	public String ManageAttendeees(@PathVariable("id") Long id, @PathVariable("choice") String choice, HttpSession session) {
		Long userId = this.userSessionId(session);
		Course course = this.cService.findById(id);
		boolean add = (choice.equals("add"));
		if(userId == null)
			return "redirect:/courses";
		User user = this.uService.findById(userId);
		this.cService.manageUsers(course, user, add);
		return "redirect:/courses";
	}
}

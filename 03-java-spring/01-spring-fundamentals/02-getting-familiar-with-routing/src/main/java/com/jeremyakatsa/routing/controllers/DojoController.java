package com.jeremyakatsa.routing.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{company}")
	public String dojoName(@PathVariable("company") String dojoName, Model model) {
		model.addAttribute("dojo", dojoName);
		return "The dojo is awesome!";
	}
	@RequestMapping("/{company}/{location}")
	public String locationName(	
	 @PathVariable("location") String locationName, Model model) {
		model.addAttribute("burbank", locationName);
		return "Burbank Dojo is located in Southern California!";
	}
	@RequestMapping(path="/dojo/san-jose")
	public String locationName2() {
		return "SJ dojo is the headquarters!";
	}

}

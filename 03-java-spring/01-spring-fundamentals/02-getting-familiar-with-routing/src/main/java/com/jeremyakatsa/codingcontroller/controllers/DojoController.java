package com.jeremyakatsa.codingcontroller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DojoController {
	
	@RequestMapping("/{company}")
	public String dojo(@PathVariable("company") String dojoName, Model model) {
		model.addAttribute("dojo", dojoName);
		return "The dojo is awesome!";
	}
	@RequestMapping("/{company}/{name}")
	public String dojoBurbank
	(@PathVariable("company") String dojoName, 
	 @PathVariable("name") String burbank, Model model) {
		model.addAttribute("dojo", dojoName);
		model.addAttribute("burbank", burbank);
		return "Burbank Dojo is located in Southern California!";
	}
	@RequestMapping("/{company}/{name}")
	public String dojoSanJose
	(@PathVariable("company") String dojoName, 
	 @PathVariable("name") String sanJose, Model model) {
		model.addAttribute("dojo", dojoName);
		model.addAttribute("San Jose", sanJose);
		return "SJ dojo is the headquarters!";
	}
}

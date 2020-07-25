package com.jeremyakatsa.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HumanController {
	@RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("userName", "Human");
        return "index.jsp";
    }
//	@RequestMapping("/")
//    public String index(@RequestParam(value="q", required=false) String query, Model model) {
//        return "Human " + query;
//    }
//	@RequestMapping("/{company}/{location}")
//	public String locationName(	
//	 @PathVariable("location") String locationName, Model model) {
//		model.addAttribute("burbank", locationName);
//		return "Burbank Dojo is located in Southern California!";
//	}

}

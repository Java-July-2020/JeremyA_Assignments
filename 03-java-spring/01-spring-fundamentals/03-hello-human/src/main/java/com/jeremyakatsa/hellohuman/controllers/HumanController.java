package com.jeremyakatsa.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanController {
//	@RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("userName", "Human");
//        return "index.jsp";
//    }
//	@RequestMapping("/")
//    public String index(@RequestParam(value="q", required=false) String query, Model model) {
//        return "Human " + query;
//    }
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String name, @RequestParam(value="last_name", required=false) String lname, Model model) {
    	if (name != null && lname != null) {
    		model.addAttribute("userName", name);
    		model.addAttribute("lastName", lname);
    	}
    	else if (name != null && lname == null) {
    		model.addAttribute("userName", name);
    	}
    	else if (name == null && lname != null) {
    		model.addAttribute("lastName", name);
    	}
    	else {
    		model.addAttribute("userName", "Human");
    	}
    	
        return "index.jsp";
    }

}

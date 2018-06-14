package com.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	@RequestMapping(value="/join")
	public String join(Model model) {
		
		return "JoinForm";
	}
	
	@RequestMapping(value="/join1")
	public String join1(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		return "joinresult";
	}
}

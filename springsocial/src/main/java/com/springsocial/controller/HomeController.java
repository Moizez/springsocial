package com.springsocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springsocial.model.UserInfo;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("user", new UserInfo());		
		return "/home";
	}

}

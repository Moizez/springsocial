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
		model.addAttribute("errormessage");
		return "/home";
	}
	
	@GetMapping(value="/loginfailure")
	public String loginfailure(Model model) {
		model.addAttribute("user", new UserInfo());
		model.addAttribute("errormessage", "Por favor, verifique seu e-mail ou senha!");
		return "/home";
	}

}

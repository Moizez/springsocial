package com.springsocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import org.springframework.social.facebook.api.User;

import com.springsocial.model.UserInfo;
import com.springsocial.service.FacebookService;

@Controller
public class FacebookController {
	
	@Autowired
	private FacebookService facebookService;
	
	@GetMapping("/facebooklogin")
	public RedirectView facebookLogin() {
		RedirectView redirectview = new RedirectView();
		String url = facebookService.facebookLogin();
		redirectview.setUrl(url);
		return redirectview;
	}
	
	@RequestMapping(value="/facebook")
	public String facebook(@RequestParam("code") String code) {
		String accessToken = facebookService.getFacebookAccessToken(code);
		return "redirect:/facebookprofiledata/"+accessToken;		
	}
	
	@GetMapping(value="/facebookprofiledata/{accessToken:.+}")
	public String facebookprofiledata(@PathVariable String accessToken, Model model) {
		User user  = facebookService.getFacebookProfile(accessToken);
		System.out.println(accessToken);
		
		if(user != null) {
			UserInfo userinfo = new UserInfo(user.getFirstName(), user.getLastName(),"", user.getEmail());
			System.out.println(userinfo.getFirstName());
			 
			model.addAttribute("user", userinfo);
		}
		
		return "view/userprofile";		
		
	}
	

}

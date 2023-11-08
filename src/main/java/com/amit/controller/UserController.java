package com.amit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amit.entity.User;
import com.amit.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute(new User());
		return "index";
	}

	@PostMapping("/user")
	public String saveData(@ModelAttribute("user") User user, Model model) {
		userService.saveUser(user);
		
		model.addAttribute("msg", "Success");
		
		return "index";
	}
}

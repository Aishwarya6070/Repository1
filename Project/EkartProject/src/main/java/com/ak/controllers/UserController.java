package com.ak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ak.models.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/login")
	public String displayLogin(Model model) {
		
		User user=new User();
		model.addAttribute("user",user);
		
		return "user_login";
	}
	@PostMapping("/login")
	public String proceddLogin(@ModelAttribute("user") User user,Errors errors,Model model) {
		
		if(errors.hasErrors()) {
			return "user_login";
		}
		System.out.println("User logged in");
		return "login"; 

}

}
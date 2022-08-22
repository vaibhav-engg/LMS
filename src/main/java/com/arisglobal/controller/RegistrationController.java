package com.arisglobal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arisglobal.entity.User;
import com.arisglobal.service.UserService;
@Controller
@RequestMapping("/registration")

public class RegistrationController {
	@Autowired
	private UserService userService;
	@RequestMapping("/userform")
	public String userform(Model model) {
		// create a reservation object
		User user = new User();
		// provide reservation object to the model
		model.addAttribute("registration", user);
		return "registration";
	}

	@RequestMapping("/submitForm")
	public String redirectSaveUser(@ModelAttribute("user") User user)
	{
		userService.saveUser(user);
		return "saveuser";
	}


}

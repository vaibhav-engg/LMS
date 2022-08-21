package com.arisglobal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

import com.arisglobal.entity.User;
import com.arisglobal.service.UserService;

@Controller
public class UserController {
	@RequestMapping("/edituser")
	public String redirectEditUser()
	{
		return "edituser";
	}
	@RequestMapping("/alluser")
	public String redirectViewAllUser(Model model)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService)context.getBean("userService");
		ArrayList<User> list = service.findAllUsers();
		model.addAttribute("userlist", list);
		return "alluser";
	}
	@RequestMapping("/userdetail")
	public String redirectUserDetail(@ModelAttribute("user") User user,Model model)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService)context.getBean("userService");
		User res = service.getUserById(user.getId());
		user.setAddress(res.getAddress());
		user.setEmail(res.getEmail());
		user.setMobile_number(res.getMobile_number());
		user.setPassword(res.getPassword());
		user.setRole_id(res.getRole_id());
		return "edituserdetails";
	}
	@RequestMapping("/saveuser")
	public String redirectSaveUser(@ModelAttribute("user") User user)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService)context.getBean("userService");
		service.updateUser(user);
		return "manageuser";
	}
}

package com.arisglobal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

import com.arisglobal.entity.User;
import com.arisglobal.dao.impl.UserDaoImpl;

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
		UserDaoImpl obj = new UserDaoImpl();
		ArrayList<User> list = obj.findAllUsers();
		model.addAttribute("userlist", list);
		return "alluser";
	}
	@RequestMapping("/userdetail")
	public String redirectUserDetail(@ModelAttribute("user") User user,Model model)
	{
		UserDaoImpl obj = new UserDaoImpl();
		User res = obj.getUserById(user.getId());
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
		UserDaoImpl obj = new UserDaoImpl();
		obj.saveUser(user);
		return "manageuser";
	}
}

package com.arisglobal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

import com.arisglobal.entity.User;
import com.arisglobal.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/edituser")
	public String redirectEditUser(Model model)
	{
		model.addAttribute("user",new User());
		return "edituser";
	}
	@RequestMapping("/alluser")
	public String redirectViewAllUser(Model model)
	{
		List<User> list = userService.findAllUsers();
		model.addAttribute("userlist", list);
		return "alluser";
	}
	@RequestMapping("/userdetail")
	public String redirectUserDetail(@ModelAttribute("user") User user,Model model)
	{
		User res = userService.findById(user.getId());
		user.setUser_name(res.getUser_name());
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
		User res = userService.findById(user.getId());
		res.setRole_id(user.getRole_id());
		userService.updateUser(res);
		return "manageuser";
//		return "test";
	}
	@RequestMapping("/manageuser")
	public String redirectMain()
	{
		return "manageuser";
	}
	@RequestMapping("/delete")
	public String redirectDelete()
	{
		return "delete";
	}
	@RequestMapping("/edit/{id}")
	public String redirectUserDetailsById(@PathVariable("id")int id,Model m)
	{
		User res = userService.findById(id);
		m.addAttribute("user", res);
		return "edituserdetails";
	}
	@RequestMapping("/deleteuser")
	public String redirectDeleteUser(@ModelAttribute("user") User user,Model model)
	{
		User res = userService.findById(user.getId());
		user.setUser_name(res.getUser_name());
		user.setAddress(res.getAddress());
		user.setEmail(res.getEmail());
		user.setMobile_number(res.getMobile_number());
		user.setPassword(res.getPassword());
		user.setRole_id(res.getRole_id());
		return "deleteuser";
	}
	@RequestMapping("/deleteuser/{id}")
	public String redirectDeleteUserById(@PathVariable("id")int id,Model m)
	{
		User res = userService.findById(id);
		m.addAttribute("user", res);
		return "deleteuser";
	}
	@RequestMapping("/deleteuser/confirmdeleteuser")
	public String redirectConfirmDelete(@ModelAttribute("user")User user,Model m)
	{
		User res = userService.findById(user.getId());
		userService.deleteUserByID(user.getId());
		m.addAttribute("user", res);
		return "deleteduser";
	}
	
}
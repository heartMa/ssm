package com.w3cjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.w3cjava.pojo.User;
import com.w3cjava.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value={"list",""})
	public String index(Model model){
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("allUsers", allUsers);
		return "user/userList";
	}
	
	@RequestMapping(value={"add"})
	public String add(){
		return "user/userAdd";
	}
	
	@RequestMapping(value={"edit"})
	public String edit(User user){
		User user2 = userService.findById(user.getId());
		System.out.print(user2);
		return "user/userEdit";
	}
	
	@RequestMapping(value={"delete"})
	public String delete(User user){
		userService.findById(user.getId());
		return "user/userList";
	}
	
	
	
}

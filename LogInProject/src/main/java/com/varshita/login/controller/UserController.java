package com.varshita.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.varshita.login.entity.User;
import com.varshita.login.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String validateUser(@RequestParam("username") String username,@RequestParam("pass") String password) {
		return userService.validateUser(username, password);
	}
	
	@PostMapping("/user")
	public String AddUser(@RequestBody User user) {
		userService.addUser(user);
		return "User Registered Successfully.!!!..";
	}
}

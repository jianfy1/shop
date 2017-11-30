package com.groupid.shop.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.groupid.shop.domain.User;
import com.groupid.shop.services.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@GetMapping (value="/account/{id}")
    public String home(@PathVariable String id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute("userId", user.getUserId());
		model.addAttribute("email", user.getEmail());
    	return "account";
    }
}

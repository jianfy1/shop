package com.groupid.shop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.groupid.shop.services.UserService;

/**
 * @author Fu YingJian
 * 
 */

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/home")
	public String home() {
		return "index";
	}

	@GetMapping(value = "/hello")
	public @ResponseBody String hello() {
		return "hello world!";
	}

	@PostMapping(value = "/login")
	public void login(@RequestParam("userId") String userId, @RequestParam String password) {
	}
}

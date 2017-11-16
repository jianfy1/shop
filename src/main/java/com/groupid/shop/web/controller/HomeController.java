package com.groupid.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping(value = "/home")
	public String home() {
		return "index";
	}

	@GetMapping(value = "/hello")
	public @ResponseBody String hello() {
		return "hello world!";
	}
}

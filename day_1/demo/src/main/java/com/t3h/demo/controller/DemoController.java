package com.t3h.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello", "Hello Anh Em");
		return "hello";
	}
}

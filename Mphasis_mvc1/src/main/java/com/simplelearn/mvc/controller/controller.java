package com.simplelearn.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	
	@GetMapping("/vinay")
	public String greeting()
	{
		return "Hello";
		
	}

}

package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello(@RequestParam("name") String name) {
		return new ModelAndView("hello","name",name);
	}
	
	@RequestMapping("/welcome")
	public ModelAndView sayWelcome() {
		String name = "Balaji";
		return new ModelAndView("welcome","name",name);
	}

}

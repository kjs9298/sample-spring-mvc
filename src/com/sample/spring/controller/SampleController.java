package com.sample.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>I'm from sample controller ! </div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}

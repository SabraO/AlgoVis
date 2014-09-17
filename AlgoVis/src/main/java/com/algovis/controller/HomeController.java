package com.algovis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showHomePage() {

		ModelAndView model = new ModelAndView("home");
	
		return model;

	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showHomePageAfterAnimation() {

		ModelAndView model = new ModelAndView("home");
	
		return model;

	}
	

}
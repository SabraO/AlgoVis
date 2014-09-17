package com.algovis.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.algovis.service.ContactService;
import com.algovis.domain.Contact;

@Controller
public class ContactController {

	@Resource(name = "contactService")
	private ContactService contactService;
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ModelAndView saveOpinion(@RequestParam(value = "name", required = false) String name,@RequestParam(value = "email", required = false) String email ,@RequestParam(value = "opinion", required = false) String opinion){
		
		Contact cn = new Contact();
		cn.setName(name);
		cn.setEmail(email);
		cn.setOpinion(opinion);
		contactService.add(cn);
		
		return new ModelAndView("test");
	}
}

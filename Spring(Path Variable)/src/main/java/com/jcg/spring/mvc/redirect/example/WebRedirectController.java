package com.jcg.spring.mvc.redirect.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebRedirectController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message","Hello ");
		return "welcome";
	}

	

	@RequestMapping(value = "/welcome/{user}", method = RequestMethod.GET)
	public String finalPage(@PathVariable("user") String name,ModelMap model) {
		 model.addAttribute("message","Henlo ");
		 model.addAttribute("message1",name);
         return "final";
	}
}
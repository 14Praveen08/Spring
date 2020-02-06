package com.jcg.spring.mvc.redirect.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebRedirectController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message","Hello ");
		return "welcome";
	}

	@RequestMapping(value = "/redirect_page", method = RequestMethod.GET)
	public String redirect() {
		System.out.println("Redirecting Result To The Final Page");
		return "redirect:final_page";
	}

	@RequestMapping(value = "/final_page", method = RequestMethod.GET)
	public String finalPage(ModelMap model) {
		 model.addAttribute("message","Henlo ");
         return "final";
	}
}
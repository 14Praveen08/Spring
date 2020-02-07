package com.jcg.spring.mvc.redirect.example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@RequestMapping(value="/user/register", method=RequestMethod.GET)
	public String register(Map<String,Object>map) {
		return "user/register";
	}
	
	@RequestMapping(value="/user/details", method=RequestMethod.POST)
	public String details(@RequestParam("fname") String fname,
	@RequestParam("lname") String lname,
	@RequestParam("qualification") String qualification,
	@RequestParam("number") String number,
	@RequestParam("email") String email,
	Map<String,Object>map ) {
		
		map.put("fname", fname);
		map.put("lname", lname);
		map.put("qualification", qualification);
		map.put("number", number);
		map.put("email", email);
		
		return "user/viewDetails";
	}
	
	
		
	

}

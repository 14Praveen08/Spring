package com.jcg.spring.mvc.redirect.example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jcg.spring.mvc.redirect.example1.User;

@Controller

//Class level Handler Mapping
@RequestMapping("/user") 
public class UserController {
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Map<String,Object>map) {
		return "user/register";
	}
	
	@RequestMapping(value="/details", method=RequestMethod.POST)
	public String details(User user,Map<String,Object>map ) {
		map.put("fname", user.getFname());
		map.put("lname", user.getLname());
		map.put("qualification", user.getQualification());
		map.put("number", user.getNumber());
		map.put("email", user.getEmail());
		
		return "user/viewDetails";
	}
	
	
		
	

}

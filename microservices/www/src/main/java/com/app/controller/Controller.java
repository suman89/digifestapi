package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@RequestMapping(path = "/test", method = {RequestMethod.GET})
	public String test()
	{
		
		return "Hi" ;  
	}

}

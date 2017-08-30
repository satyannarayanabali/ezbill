package com.ezbill.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EzbillWebController {
	@RequestMapping("/welcome")
	public String getWelcomeMessage(){
		
		return "Welcome Easy Bill Application";
	}

}

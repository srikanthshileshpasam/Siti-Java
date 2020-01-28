package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Login {
	@Autowired
	@RequestMapping("/validateLogin")
	public @ResponseBody String validateUserLogin() 
	{
		return "<h1>Inside handlerOne() Method Of MyController</h1>";
    }
	
	
}

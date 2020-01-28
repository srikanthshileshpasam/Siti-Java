package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Login")
public class Login {
	
	@RequestMapping("/validateLogin")
	public void validateUserLogin() 
	{
		System.out.println("Eureka");    }
	
	
}

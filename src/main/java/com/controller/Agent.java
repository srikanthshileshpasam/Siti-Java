package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.LoginVO;
import com.service.LoginService;

@Controller 
@Scope("session")
@RequestMapping("Admin")
public class Agent {
	
	//@RequestMapping(value="/validateVC", method = { RequestMethod.GET, RequestMethod.POST })
	
	
}

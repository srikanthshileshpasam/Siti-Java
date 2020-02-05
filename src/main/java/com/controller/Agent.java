package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.model.CustomerVO;
import com.service.AgentService;

@Controller 
@Scope("session")
@RequestMapping("Admin")
public class Agent {
	
	@RequestMapping(value="/validateVC", method = { RequestMethod.GET, RequestMethod.POST })
	
	public CustomerVO validateCustomerVC(@RequestParam String vcnumber ,HttpServletRequest request) throws IOException
	{
		CustomerVO lCustomerVO= new CustomerVO();
		AgentService lAgentService=new AgentService();
		lCustomerVO=lAgentService.validateCustomerVC(vcnumber);
		
		return lCustomerVO;
    }
}

package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.CustomerVO;
import com.service.AgentService;

@Controller 
@Scope("session")
@RequestMapping("Agent")
public class Agent {
	
	@RequestMapping(value="/validateVC", method = { RequestMethod.GET, RequestMethod.POST })
	
	public @ResponseBody CustomerVO validateCustomerVC(@RequestBody CustomerVO inCustomerVO ,HttpServletRequest request) throws IOException
	{
		CustomerVO lCustomerVO= new CustomerVO();
		AgentService lAgentService=new AgentService();
		lCustomerVO=lAgentService.validateCustomerVC(inCustomerVO.getVc_no());
		
		
		return lCustomerVO;
    }
}

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
import com.model.TransactionVO;
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
	
	
@RequestMapping(value="/submitTransaction", method = { RequestMethod.GET, RequestMethod.POST })
	
	public @ResponseBody int submitTransaction(@RequestBody TransactionVO lTransactionVO ,HttpServletRequest request) throws IOException
	{
	
		AgentService lAgentService=new AgentService();
		System.out.println(request.getSession().getAttribute("userId"));
		System.out.println(request.getSession().getAttribute("name"));
		int agentId= Integer.parseInt(request.getSession().getAttribute("userId")+"");
		String name = (String) request.getSession().getAttribute("name");
		System.out.println(agentId);
		System.out.println(name);
		lTransactionVO.setAgent_id(agentId);
		lTransactionVO.setAgent_name(name);
		int result=lAgentService.submitTransaction(lTransactionVO);
		
		
		return result;
    }
}

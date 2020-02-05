package com.service;

import com.dao.AgentDAO;
import com.model.CustomerVO;

public class AgentService {


	public CustomerVO validateCustomerVC(String vcnumber)
	{
		
		System.out.println("In AgentService method = validateUser() ");
		AgentDAO lAgentDAO= new AgentDAO();
		CustomerVO result =  lAgentDAO.validateCustomerVC(vcnumber);
	
		
		return result;
		
		
	}
	
	
}

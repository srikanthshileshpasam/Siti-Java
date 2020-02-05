package com.service;

import com.dao.AgentDAO;
import com.model.CustomerVO;
import com.model.TransactionVO;

public class AgentService {


	public CustomerVO validateCustomerVC(String vcnumber)
	{
		
		System.out.println("In AgentService method = validateUser() ");
		AgentDAO lAgentDAO= new AgentDAO();
		CustomerVO result =  lAgentDAO.validateCustomerVC(vcnumber);
	
		
		return result;
		
		
	}
	
	public int submitTransaction(TransactionVO lTransactionVO)
	{
		
		System.out.println("In AgentService method = submitTransaction() ");
		AgentDAO lAgentDAO= new AgentDAO();
	
		
		int result =  lAgentDAO.submitTransaction(lTransactionVO);
	    
		
		return result;
		
		
	}
	
}

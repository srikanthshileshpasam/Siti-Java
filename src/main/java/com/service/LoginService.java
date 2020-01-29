package com.service;

import com.dao.LoginDAO;
import com.model.LoginVO;

public class LoginService {
	
	public int validateUser(LoginVO lLoginVO)
	{
		System.out.println("In LoginService method = validateUser() ");
		LoginDAO lLoginDAO= new LoginDAO();
		int result =  lLoginDAO.validateUser(lLoginVO);
		
		if(result == 0)
		{
			
			return result;
			
		}
		
		return 1;
		
		
	}

}

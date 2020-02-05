package com.service;

import com.dao.LoginDAO;
import com.model.LoginVO;

public class LoginService {
	
	public LoginVO validateUser(LoginVO lLoginVO)
	{
		System.out.println("In LoginService method = validateUser() ");
		LoginDAO lLoginDAO= new LoginDAO();
		LoginVO result =  lLoginDAO.validateUser(lLoginVO);
	
		
		return result;
		
		
	}

}

package com.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.LoginVO;
import com.service.LoginService;

@RestController
@RequestMapping("Login")
public class Login {
	
	@RequestMapping(value="/validateLogin", method = RequestMethod.POST)
	 @ResponseBody
	public String validateUserLogin(@RequestBody LoginVO  lLoginVO, HttpServletRequest request)
	{
		/*@RequestParam("login") String id, @RequestParam("pass") String pw*/
	    
		System.out.println("Validating User Credentials");   
		LoginService lLoginService=new LoginService();
		int result = lLoginService.validateUser(lLoginVO);
		System.out.println(result);
		
		if( result==0)
		{
			return "Passed";
		}
		
	 return "Invlalid credentials";
	}
	
	
	
}

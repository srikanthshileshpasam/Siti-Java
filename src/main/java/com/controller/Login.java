package com.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.LoginVO;
import com.service.LoginService;

@Controller 
@Scope("session")
@RequestMapping("Login")
public class Login {
	
	@RequestMapping(value="/validateLogin", method = { RequestMethod.GET, RequestMethod.POST })
	
	public ModelAndView validateUserLogin(@RequestBody LoginVO  lLoginVO,HttpServletRequest request) throws IOException
	{
		
		
		System.out.println("Validating User Credentials");   
		LoginService lLoginService=new LoginService();
		LoginVO result = lLoginService.validateUser(lLoginVO);
		System.out.println(result);
		
		
		if(result.getLoginValid()==0 && result.getUserStatus().equals("active"))
		{    
		if(result.getUserType().equals("agent"))
		request.getSession().setAttribute("page","home");
		else if (result.getUserType().equals("admin"))
		request.getSession().setAttribute("page","adminHome");
		return new ModelAndView(request.getSession().getAttribute("page")+"");
		}
		request.getSession().setAttribute("page","index");
		return new ModelAndView("index");
    }
	
	@RequestMapping(value="/pagename", method = { RequestMethod.GET, RequestMethod.POST })
	
	public @ResponseBody String getPageName(HttpServletRequest request) throws IOException
	{
		
		   
		String pageName=(String) request.getSession().getAttribute("page");
		
		
		return pageName;
	
	}
}



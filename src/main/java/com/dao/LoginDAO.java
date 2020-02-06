package com.dao;

import com.model.LoginVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO 
{
	 public static Connection  getConnection(){
		  Connection connection=null;
		  try{
		   Class.forName("org.sqlite.JDBC");
		    connection=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mypc\\Desktop\\Georgia Python\\siti_db.db");
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		  return connection;
		 }
	 
	public LoginVO validateUser(LoginVO lLoginVO)
	{
		System.out.println("In LoginDAO method = validateUser() ");
		LoginVO respLoginVO =new LoginVO();
		String userId= lLoginVO.getId()+"";
		String userPass=lLoginVO.getPass();
		try {
		Connection conn=getConnection();
	    PreparedStatement pstmt=null;
	    if(conn!=null){
	    	String selectSQL="SELECT password,user_status,user_type,name,user_id from user where user_id="+userId;
	        pstmt=conn.prepareStatement(selectSQL);
	       
	        ResultSet rs=pstmt.executeQuery();
	        while(rs.next()){
	        // System.out.println(""+rs.getString(1));
             if (userPass.equals(rs.getString(1)) && "active".equals(rs.getString(2)))
             {   
            	 
            	 respLoginVO.setLoginValid(0);
            	 respLoginVO.setUserStatus(rs.getString(2));
            	 respLoginVO.setUserType(rs.getString(3));
            	 respLoginVO.setUserName(rs.getString(4));
            	 respLoginVO.setId(Integer.parseInt(rs.getString(5)));
            	 System.out.println("User is validated ....");
      
             }
             else
             {
            	 respLoginVO.setLoginValid(1);
             }
	        }
		
	    }
	    
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return respLoginVO;
		
		
	}
	
}

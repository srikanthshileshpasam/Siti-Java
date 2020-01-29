package com.dao;

import com.model.LoginVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
	 
	public int validateUser(LoginVO lLoginVO)
	{
		System.out.println("In LoginDAO method = validateUser() ");
		
		String userId= lLoginVO.getId();
		String userPass=lLoginVO.getPass();
		try {
		Connection conn=getConnection();
	    PreparedStatement pstmt=null;
	    if(conn!=null){
	    	String selectSQL="SELECT password from user where user_id="+userId;
	        pstmt=conn.prepareStatement(selectSQL);
	       
	        ResultSet rs=pstmt.executeQuery();
	        while(rs.next()){
	        // System.out.println(""+rs.getString(1));
             if (userPass.equals(rs.getString(1)))
             {   
            	 System.out.println("User is validated ....");
            	 return 0;
             }
	        }
		
	    }
	    
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return 1;
		
		
	}
	
}

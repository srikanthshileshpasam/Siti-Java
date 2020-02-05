package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.CustomerVO;


public class AgentDAO {

	
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
	 
	public CustomerVO validateCustomerVC(String vcnumber)
	{
		System.out.println("In AgentDAO method = validateCustomerVC() ");
		CustomerVO respCustVO =new CustomerVO();
		
		try {
		Connection conn=getConnection();
	    PreparedStatement pstmt=null;
	    if(conn!=null){
	    	String selectSQL="SELECT vc_no,sms_id,location_id,customer_name,address,area,city,card_no,status,cell_1,cell_2,package, package_sub, last_paid,next_bill_date FROM customer_detail where vc_no ="+vcnumber;
	        pstmt=conn.prepareStatement(selectSQL);
	       
	        ResultSet rs=pstmt.executeQuery();
	        
	        while(rs.next())
	        {
	        	System.out.println("Query executed...");	
            	respCustVO.setVc_no(rs.getString(1));
            	respCustVO.setSms_id(rs.getString(2));
            	respCustVO.setLocation_id(rs.getString(3));
            	respCustVO.setCustomer_name(rs.getString(4));
            	respCustVO.setAddress(rs.getString(5));
            	respCustVO.setArea(rs.getString(6));
            	respCustVO.setCity(rs.getString(7));
            	respCustVO.setCard_no(rs.getString(8));
            	respCustVO.setStatus(rs.getString(9));
            	respCustVO.setCell_no(rs.getString(10));
            	respCustVO.setCell_no2(rs.getString(11));
            	respCustVO.setPkg(rs.getString(12));
            	respCustVO.setPkg_sub(rs.getString(13));
            	respCustVO.setLast_paid(rs.getString(14));
            	respCustVO.setNext_billdate(rs.getString(15));  	
           
	        }
		
	    }
	    
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return respCustVO;
		
		
	}
}

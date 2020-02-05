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
	    	String selectSQL="SELECT vc_no,\r\n" + 
	    			"       sms_id,\r\n" + 
	    			"       location_id,\r\n" + 
	    			"       customer_name,\r\n" + 
	    			"       address,\r\n" + 
	    			"       area,\r\n" + 
	    			"       city,\r\n" + 
	    			"       card_no,\r\n" + 
	    			"       status,\r\n" + 
	    			"       cell_1,\r\n" + 
	    			"       cell_2,\r\n" + 
	    			"       package,\r\n" + 
	    			"       package_sub,\r\n" + 
	    			"       last_paid,\r\n" + 
	    			"       next_bill_date\r\n" + 
	    			"  FROM customer_detail where vc_no ="+vcnumber;
	        pstmt=conn.prepareStatement(selectSQL);
	       
	        ResultSet rs=pstmt.executeQuery();
	        
	        if(rs.next())
	        {
	       
            if ("active".equals(rs.getString(9)))
            {   
            	respCustVO.setStatus("Activated");
            	respCustVO.setVc_no(rs.getString(1));
            	respCustVO.setSms_id(rs.getString(2));
            	respCustVO.setLocation_id(rs.getString(3));
            	respCustVO.setCustomer_name(rs.getString(4));
            	respCustVO.setAddress(rs.getString(5));
            	respCustVO.setArea(rs.getString(6));
            	respCustVO.setCity(rs.getString(7));
            	respCustVO.setCard_no(rs.getString(8));
            	respCustVO.setCell_no(rs.getString(10));
            	respCustVO.setCell_no2(rs.getString(11));
            	respCustVO.setPkg(rs.getString(12));
            	respCustVO.setPkg_sub(rs.getString(13));
            	respCustVO.setLast_paid(rs.getString(14));
            	respCustVO.setNext_billdate(rs.getString(15));
            	
            	
            }
            else
            {
            	respCustVO.setStatus("Deactivated");
            }
	        }
	        else
	        {
	        	respCustVO.setStatus("No customer found with entered VC number");
	        	
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

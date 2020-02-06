package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.CustomerVO;
import com.model.TransactionVO;


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
	
	
	public int submitTransaction(TransactionVO lTransactionVO)
	{
		System.out.println("In AgentDAO method = submitTransaction() ");
		CustomerVO respCustVO =new CustomerVO();
		 int result =0;
		 int finalResult=0;
		try {
		Connection conn=getConnection();
	    PreparedStatement pstmt=null;
	    if(conn!=null)
	    {
	    	String selectSQL="insert into [transaction] (vc_no, agent_id,receipt_num,payment_method,amount_paid,package,transaction_date,remarks,agent_name) values (?,?,?,?,?,?,datetime('now'),?,?)" ;
	        pstmt=conn.prepareStatement(selectSQL);
	        pstmt.setLong(1, lTransactionVO.getVc_no());
	        pstmt.setLong(2, lTransactionVO.getAgent_id());
	        pstmt.setLong(3, lTransactionVO.getReceipt_no());
	        pstmt.setString(4, lTransactionVO.getPaymentmethod());
	        pstmt.setDouble(5, lTransactionVO.getAmount());
	        pstmt.setString(6, lTransactionVO.getPkg());
	        pstmt.setString(7, lTransactionVO.getRemarks());
	        pstmt.setString(8, lTransactionVO.getAgent_name());
	        
	        result=pstmt.executeUpdate();
	        
	        
	        if(result!=0)
	        {
	        	  PreparedStatement pstmt1=null;
	        	  String updateSQL="update customer_detail set last_paid=strftime('%d-%m-%Y','now'),package=?,next_bill_date= strftime('%d-%m-%Y', ?/1000.0, 'unixepoch') where vc_no=?" ;
	  	          pstmt=conn.prepareStatement(updateSQL);
	  	          pstmt.setString(1, lTransactionVO.getPkg());
		          pstmt.setDate(2, lTransactionVO.getNextDueDate());
		          pstmt.setLong(3, lTransactionVO.getVc_no());
		          
		          finalResult=pstmt.executeUpdate();
	        	
	        	
	        	
	        }
	       
		
	    }
	    
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return finalResult;
		
		
	}
}

function toggle() {
	  var vcnumber=document.getElementById("vc_no").value;
	  /*
	  const myNode = document.getElementById("toggleDIV");
	  myNode.innerHTML = '';
	  */
	    document.getElementById("readVc").innerHTML="";
	    document.getElementById("readcname").innerHTML="";
	    document.getElementById("readcphone").innerHTML="";
	    document.getElementById("readduedate").innerHTML="";
	    document.getElementById("errordiv").innerHTML="";
		if(validateVCnumber(vcnumber))
			{
			
	         getCustomerDetails(vcnumber);
		    
			}
		else
			{
			document.getElementById("errordiv").innerHTML="VC number cannot be blank.";
			}	
}

function validateVCnumber(vcnumber) 
{
	
  
	
	if(vcnumber!= null && vcnumber!="")
		{
		
		 return true;
		}
   
  

return false;

}

function getCustomerDetails(vcnumber) {
	
	
	console.log("Inside getCustomerDetails");

	var customerData = {
			"vc_no": vcnumber
		   }
	
	$.ajax({
		type : 'POST',
	    contentType : 'application/json',
		url : 'Agent/validateVC',
		data : JSON.stringify(customerData),
		headers: {
		      "Content-Type": "application/json",
		      "cache-control": "no-cache"
		     
		    },
		timeout : 100000,
		success : function(response) {
		  
			console.log("SUCCESS: ", response);
		//	getUserPageName(response);
			
		//	console.log("pageName="+pageName);
			if(response.vc_no!=null && response.vc_no!="")
				{
			    document.getElementById("toggleDIV").style.display = "block";
			    document.getElementById("readVc").innerHTML="CUSTOMER VC -"+response.vc_no;
			    document.getElementById("readcname").innerHTML="CUSTOMER NAME -"+response.customer_name;
			    document.getElementById("readcphone").innerHTML="CUSTOMER PHONE -"+response.cell_no;
			    document.getElementById("readduedate").innerHTML="DUE DATE -"+response.next_billdate;
				}
			else
				{
				document.getElementById("errordiv").innerHTML="Invalid VC number";

				}
				
				 
		    
		},
		error : function(e) {
			console.log("ERROR: ", e);
			
		},
		done : function(e) {
			console.log("DONE");
			
		}
	});
	
	console.log("End getCustomerDetails method()");
	
}

function paymentForm()
{
	 
	  if(validatepaymentForm())
		{
		
       submitPaymentForm();
	    
		}
	else
		{
		document.getElementById("errordiv1").innerHTML="Payment form not completely filled.!";
		}	



}


function validatepaymentForm()
{
	  var receipt=document.getElementById("receipt").value;
	  var pkg=document.getElementById("package").value;
	  var amount=document.getElementById("amount").value;
	  var remarks=document.getElementById("remarks").value;
	  var vcnumber=document.getElementById("vc_no").value;
	  var nextDueDate=document.getElementById("nextduedate").value;
	  var paymentMethod="cash";
	  if( receipt!=null && receipt!="" &&
		  pkg!=null && pkg!="" &&
		  amount!= null && amount!="" &&
		  remarks!=null && remarks!="" &&
		  vcnumber!= null && vcnumber!="" &&
		  nextDueDate!=null && nextDueDate!="" 
	  )
		  {
		  
		   return true;
		  
		  }
	  
      
      return false;



}

function submitPaymentForm()
{
	console.log("Inside submitPaymentForm");
	  var receipt=document.getElementById("receipt").value;
	  var pkg=document.getElementById("package").value;
	  var amount=document.getElementById("amount").value;
	  var remarks=document.getElementById("remarks").value;
	  var vcnumber=document.getElementById("vc_no").value;
	  var nextDueDate=document.getElementById("nextduedate").value;
	  var paymentMethod="cash";
	var transaction = {
			"vc_no": vcnumber,
			"pkg":pkg,
			"receipt_no":receipt,
			"amount":amount,
			"remarks":remarks,
			"nextDueDate":nextDueDate,
			"paymentmethod":paymentMethod
			
		   }
	
	$.ajax({
		type : 'POST',
	    contentType : 'application/json',
		url : 'Agent/submitTransaction',
		data : JSON.stringify(transaction),
		headers: {
		      "Content-Type": "application/json",
		      "cache-control": "no-cache"
		     
		    },
		timeout : 100000,
		success : function(response) {
		  
			console.log("SUCCESS: ", response);
		    if(response!=0)
			document.getElementById("errordiv1").innerHTML="Payment details submitted successfully.!";
		    else
			document.getElementById("errordiv1").innerHTML="Payment details submission failed.!";
	
		/*
			if(response.vc_no!=null && response.vc_no!="")
				{
			    document.getElementById("toggleDIV").style.display = "block";
			    document.getElementById("readVc").innerHTML="CUSTOMER VC -"+response.vc_no;
			    document.getElementById("readcname").innerHTML="CUSTOMER NAME -"+response.customer_name;
			    document.getElementById("readcphone").innerHTML="CUSTOMER PHONE -"+response.cell_no;
			    document.getElementById("readduedate").innerHTML="DUE DATE -"+response.next_billdate;
				}
			else
				{
				document.getElementById("errordiv").innerHTML="Invalid VC number";

				}*/
				
				 
		    
		},
		error : function(e) {
			console.log("ERROR: ", e);
			
		},
		done : function(e) {
			console.log("DONE");
			
		}
	});
	
	console.log("End submitPaymentForm method()");

}




var nextPageName="";
jQuery(document).ready(function($) {
	$("#submitForm").click(function(event) {
		
		document.getElementById("errordiv").innerHTML="";
		if(validateLogin())
			{
			
		    searchAjax();  
		    
			}
		else
			{
			document.getElementById("errordiv").innerHTML="Please enter all fields.!";
			}

	});
});


function searchAjax() {
	
	var userId=document.getElementById("login").value;
	var userPassword=document.getElementById("password").value;
//	console.log("Inside search Ajax method()");

	var loginData = {
			"id": userId, 
	        "pass": userPassword
		   }
	
	$.ajax({
		type : 'POST',
	    contentType : 'application/json',
		url : 'Login/validateLogin',
		data : JSON.stringify(loginData),
		headers: {
		      "Content-Type": "application/json",
		      "cache-control": "no-cache"
		     
		    },
		timeout : 100000,
		success : function(response) {
		//	console.log("SUCCESS: ", response);
			getUserPageName(response);
			
		//	console.log("pageName="+pageName);
			
			
				
				 
		    
		},
		error : function(e) {
			console.log("ERROR: ", e);
			
		},
		done : function(e) {
			console.log("DONE");
			
		}
	});
	
	//console.log("End search Ajax method()");
	
}



function validateLogin() 
{
	var userId=document.getElementById("login").value;
	var userPassword=document.getElementById("password").value;
	
	if(userId!= null && userId!="" && userPassword!= null && userPassword!="")
		{
		
		 return true;
		}
   
  

return false;

}

function getUserPageName(responsepage)
{   
	
//	console.log("inside getUserPageName method()");
//	console.log("responsepage="+responsepage);
	$.ajax({
		type : 'POST',
	    contentType : 'application/json',
		url : 'Login/pagename',
		headers: {
		      "Content-Type": "application/json",
		      "cache-control": "no-cache" 
		    },
		timeout : 100000,
		success : function(response) {
			//console.log("SUCCESS for page name: ", response);
			 
			if(response!=null)
				{
				var nextPageName=response;
				if(nextPageName!=null)
				{

			    	if(nextPageName!="index")
			    	{
				 	document.write(responsepage);
			    	}
			    	else
			    	{
			    	document.getElementById("errordiv").innerHTML="Invalid credentials";
			    	}
				}
			 }
		//	console.log("end getUserPageName method() with nextPageName "+nextPageName);
			return nextPageName;
			
		
		},
		error : function(e) {
			console.log("ERROR: ", e);
			
		}
	});
	
	return nextPageName;
	
	
}



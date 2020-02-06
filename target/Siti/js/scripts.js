jQuery(document).ready(function($) {
	$("#loginform").submit(function(event) {
		// Prevent the form from submitting via the browser.
		document.getElementById("errordiv").innerHTML="";
		event.preventDefault();
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
	

	var loginData = {
			"id": userId, 
	        "pass": userPassword
		   }
	
	$.ajax({
		type : "POST",
		contentType : "application/text",
		url : "Login/validateLogin",
		data: JSON.stringify(loginData),
	    contentType: "application/json; charset=utf-8",
	    dataType: "json",
	    success: function(data){
	           
	    	console.log("passed");
	    	
	    },
	    failure: function(errMsg) {
	        alert(errMsg);
	    }
	});
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

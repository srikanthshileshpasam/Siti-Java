jQuery(document).ready(function($) {
	$("#loginform").submit(function(event) {

		// Prevent the form from submitting via the browser.
		event.preventDefault();
		searchAjax();

	});
});


function searchAjax() {
	
	var userId=document.getElementById("login").value;
	var userPassword=document.getElementById("password").value;
	alert(userId);
	alert(userPassword);
//	var data = "id="+userId+"&pass="+userPassword;
	var loginData = {
			"id": userId, 
	        "pass": userPassword
		   }
	/*data["query"] = $("#query").val();*/
	/*var login ={ "id": userId, "pass": userPassword }*/
	$.ajax({
		type : "POST",
		contentType : "application/text",
		url : "Login/validateLogin",
		data: JSON.stringify(loginData),
	    contentType: "application/json; charset=utf-8",
	    dataType: "json",
	    success: function(){
	           
	    	console.log("passed");
	    	
	    },
	    failure: function(errMsg) {
	        alert(errMsg);
	    }
	});
}
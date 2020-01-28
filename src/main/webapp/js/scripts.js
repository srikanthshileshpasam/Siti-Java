
function userLogin()
{
		  			
  var userId=document.getElementById("login").value;
  var userPassword=document.getElementById("password").value;
  
  
  alert(userId);
  alert(userPassword);
  
  $.ajax({
      url : '/validatelogin',
      success : function(data) {
         
      }
  });
  
}

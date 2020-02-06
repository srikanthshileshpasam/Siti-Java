<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
	<!-- Global site tag (gtag.js) - Google Analytics -->
	   
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="js/scripts.js"></script>
		<script async src="https://www.googletagmanager.com/gtag/js?id=UA-152404059-1"></script>
		<script>
		  		window.dataLayer = window.dataLayer || [];
		  		function gtag(){dataLayer.push(arguments);}
		  		gtag('js', new Date());

		  		gtag('config', 'UA-152404059-1');
		  		  		
		</script>
		<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	
		
     <link rel="stylesheet" type="text/css" href="css/index.css">
	<title>Siti - Login</title>
  
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

 

  <meta name="Siti Web Application" content="Web Database Application for SITI Communication Network">
</head>

  <body>
    <div class="wrapper fadeInDown">
      <div id="formContent">
        <!-- Tabs Titles -->
        <h2 class="active"> Sign In </h2>
     <!--    <h2 class="inactive underlineHover">Sign Up </h2> -->

        <!-- Icon -->
        <div class="fadeIn first">
          <img src="img/icon.png" id="icon" alt="User Icon" />
        </div>

        <!-- Login Form -->
        <form action="Login/validateLogin" id="loginform" >
          <input type="text" id="login" class="fadeIn second" name="id" placeholder="Enter Login Id">
          <input type="text" id="password" class="fadeIn third" name="pass" placeholder="Enter Password">
           <div id="errordiv">
           
           </div>
         <input type="submit" class="fadeIn fourth" value="Log In" >
      <!--      <input type="button" class="fadeIn fourth" value="Log In" onClick="userLogin()" > -->
        </form>

        <!-- Remind Passowrd -->
      <!--    <div id="formFooter">
          <a class="underlineHover" href="#">Forgot Password?</a> -->
        </div>

      </div>
   
  </body>
</html>

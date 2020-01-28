<!DOCTYPE html>
<html lang="en">
<head>
	<!-- Global site tag (gtag.js) - Google Analytics -->
		<script async src="https://www.googletagmanager.com/gtag/js?id=UA-152404059-1"></script>
		<script>
		  		window.dataLayer = window.dataLayer || [];
		  		function gtag(){dataLayer.push(arguments);}
		  		gtag('js', new Date());

		  		gtag('config', 'UA-152404059-1');
		</script>

	<title>Siti - Login</title>
  
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" type="text/css" href="index.css">

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
          <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon" />
        </div>

        <!-- Login Form -->
        <form>
          <input type="text" id="login" class="fadeIn second" name="login" placeholder="Enter Login Id">
          <input type="text" id="password" class="fadeIn third" name="login" placeholder="Enter Password">
          <input type="submit" class="fadeIn fourth" value="Log In">
        </form>

        <!-- Remind Passowrd -->
        <div id="formFooter">
          <a class="underlineHover" href="#">Forgot Password?</a>
        </div>

      </div>
    </div>
  </body>
</html>

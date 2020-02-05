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
			 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script type="text/javascript" src="js/toggle.js"></script>
        <script>
        
        </script>
		<title>Siti - Agent</title>
        <script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">

	  <link rel="stylesheet" type="text/css" href="css/agent.css">

	  <meta name="Siti Web Application" content="Web Database Application for SITI Communication Network">
	</head>

  <body>
		<div class="container-contact100">
			<div class="wrap-contact100">
				<form class="contact100-form validate-form">

					<span class="contact100-form-title">
						Siti Collection Agent Entry Form
					</span>

					<div class="wrap-input100 bg1 rs1-wrap-input100 validate-input" data-validate = "Enter VC Number">
						<span class="label-input100">VC Number</span>
						<input class="input100"  type="text" maxlength="11" name="vc_no" id="vc_no" placeholder="Enter VC Number">
						<div id="errordiv">
           
                      </div>
					</div>
					

					<div class="container-contact100-form-btn space">
						<button onclick="toggle()" class="contact100-form-btn">
							<span>
								<a>Validate VC</a>
								<i aria-hidden="true"></i>
							</span>
						</button>
					</div>

					<div id="toggleDIV" style="display: none;">
					<div class="wrap-contact100">
						<span>
										 
										<ul class="label-input100">
											 <p id="readVc" ></p>
											
											
											<p id="readcname"></p>
										
											<p id="readcphone"></p>
											
											<p id="readduedate"></p>
										</ul>
						</span>
					</div>

					<div class="wrap-input100 rs1-wrap-input100 validate-input bg1" data-validate="Please Type Receipt Number">
						<span class="label-input100">Receipt Number *</span>
						<input class="input100" type="number" name="receipt" placeholder="Enter Receipt Number" required>
					</div>

					<div class="wrap-input100 validate-input bg1 rs1-wrap-input100">
						<span class="label-input100">Package *</span>
						<input class="input100" name="package" placeholder="Customer package choice" placeholder="Enter Amount Paid" required>
					</div>

					<div class="wrap-input100 validate-input bg1 rs1-wrap-input100" data-validate = "Enter Amount Paid by Customer">
						<span class="label-input100">Amount *</span>
						<input class="input100" type="number" name="amount" placeholder="Enter Amount Paid " required>
					</div>

					<div class="wrap-input100 bg0 rs1-alert-validate">
						<span class="label-input100">Remarks</span>
						<textarea class="input100" name="remarks" placeholder="Your message here..."></textarea>
					</div>

					<div class="container-contact100-form-btn space">
						<button class="contact100-form-btn">
							<span>
								<a href="agent.html">Submit Entry</a>
								<i aria-hidden="true"></i>
							</span>
						</button>
					</div>
					</div>

				</form>
			</div>
		</div>

	<!--  	<script type="text/javascript" src="js/toggle.js"></script> -->

	</body>
</html>

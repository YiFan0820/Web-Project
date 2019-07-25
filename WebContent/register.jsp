<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="" />
<link href="assets/css/font-awesome.min_register.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/style_register.css" rel="stylesheet" type="text/css" media="all"/>
<link href="assets/http://fonts.googleapis.com/css?family=Raleway:400,500,600,700,800,900" rel="stylesheet">
</head>
<body class="body">
<div class="signupform">
<h1>Interior Register Form</h1>
	<div class="container">
		
		<div class="agile_info">
			<div class="w3l_form">
				<div class="left_grid_info">
					<h3>Welcome !</h3>
					<h4>Lorem ipsum dolor sit amet, nulla consectetur adipiscing elit Sed.</h4>
					<p> Nam eleifend velit eget dolor vestibulum ornare. Vestibulum est nulla, fermentum eget euismod et, tincidunt at dui. Nulla tellus nisl, semper id justo vel, rutrum finibus risus. Cras vel auctor odio.</p>
					<ul class="social_section_1info">
						<li><a href="#" class="w3_facebook"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#" class="w3_twitter"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#" class="w3_instagram"><i class="fa fa-instagram"></i></a></li>
						<li><a href="#" class="w3_google"><i class="fa fa-google-plus"></i></a></li>
						<li><a href="#" class="w3_pinterest"><i class="fa fa-pinterest"></i></a></li>
						<li><a href="#" class="w3_vimeo"><i class="fa fa-vimeo"></i></a></li>
					</ul>
				</div>
			</div>
			<div class="w3_info">
				<h2>Create An Account</h2>
				<p>Vestibulum est nulla, fermentum eget euismod et, tincidunt at dui dolor sit.</p>
						<form action="AddUserServlet" method="post">
						<div class="input-group">
							<span><i class="fa fa-user" aria-hidden="true"></i></span>
							<input type="text" name="name" placeholder="Name" required=""> 
						</div>
						
						<div class="input-group">
							<span><i class="fa fa-envelope" aria-hidden="true"></i></span>
							<input type="email" placeholder="Email" required=""> 
						</div>
						<div class="input-group">
							<span><i class="fa fa-lock" aria-hidden="true"></i></span>
							<input type="Password" name="pwd" placeholder="Password" required="">
						</div>
						<div class="input-group">
							<span><i class="fa fa-lock" aria-hidden="true"></i></span>
							<input type="Password" placeholder="Confirm Password" required="">
						</div>
							<input type="checkbox" value="remember-me" /> <h4>Send me latest updates </h4>        
							<button class="btn btn-danger btn-block" type="submit">Create Account</button >                
					</form>
			</div>
			<div class="clear"></div>
			</div>
			
		</div>
		<div class="footer">


	</div>
	</body>
</html>
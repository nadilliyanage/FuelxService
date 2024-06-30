<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
 <link rel="stylesheet" type="text/css" href="styles/style.css">
    <link rel="stylesheet" type="text/css" href="styles/Log in.css">
	
</head>
<body>

  <header>
    <div class="logo">
      <img src="images/logo.png" alt="" height="40" width="60">
    </div>
    <nav>
      <ul>
        <li><a href="Contact us.jsp">Contact US</a></li>
        <li><a href="Help & support.jsp">Help and Support</a></li>
      </ul>
    </nav>
  </header>
  <hr style="color:white;">
        
    <div class="container">
    <h1>Login Page</h1>
	<form action="login" method="post">
		User Name <input type="text" name="username" placeholder="Enter your username"><br>
		Password <input type="password" name="password" placeholder="Enter your password"><br>
		<input type="submit" name="submit" value="Login">
	</form>
    
	<br><br><br><br>
	<button class="login-button1" onclick="loginWithFacebook()">Continue with Facebook</button>
    <button class="login-button2" onclick="loginWithgoogle()">Continue with Google</button>
    <button class="login-button3" onclick="loginWithlinkedin()">Continue with LinkedIn</button>
	
	<br><br><br><br>
	<hr>
	<br>
	<label for="agree">Create Account?</label><br><br>
	<a href="customerinsert.jsp" class="signup"> Sign up</a>
	</div>
<footer class="footer-section">
    <hr style="color:white;">
    <div class="sup_img">
      <img src="images/support.png" alt="" height="150" width="200"><br>
      <h3>DO YOU NEED ANY</h3>
      <h1>SUPPORT?</h1>
    </div>

    <div class="footer-cta pt-5 pb-5">
      <div class="single-cta">
        <div class="cta-text">
          <img src="images/location.png" alt="" height="35" width="35">
          <h4>Find us</h4>
          <span>105, New Kandy RD, Malabe</span>
        </div>

        <div class="calendar"></div>
      </div>
      <div class="single-cta">
        <div class="cta-text">
          <img src="images/Phone.png" alt="" height="35" width="35">
          <h4>Call us</h4>
          <span>+94 71 234 5678</span>
        </div>
      </div>
      <div class="single-cta">
        <div class="cta-text">
          <img src="images/mail.png" alt="" height="35" width="35">
          <h4>Mail us</h4>
          <span>info@FxS.com</span>
        </div>
       
      </div>
    </div>
    <div class="social_logo">
      <a href="https://support.google.com/accounts/answer/27441?hl=en"><img src="images/google.png" alt="" height="20" width="20"></a>
      <a href="https://www.linkedin.com/signup"><img src="images/linkedin.png" alt="" height="20" width="20"></a>
      <a href="https://twitter.com/i/flow/signup"><img src="images/twitter.png" alt="" height="20" width="20"></a>
      <a href="https://www.facebook.com/signup"><img src="images/fb.png" alt="" height="20" width="20"></a>
      <a href="https://web.telegram.org/"><img src="images/telegram.png" alt="" height="20" width="20"></a>
      <a href="https://github.com/signup"><img src="images/github.png" alt="" height="20" width="20"></a>
    </div>

<div class="copyright">
  <p>Visit Our Page : <a href="login.jsp">https://www.FxS.com</a></p>
  
</div>
    <h6>Created By SE_OOP_2023_S2_MLB_WD_G181</h6>
    <script src="js/calendar.js"></script>
  </footer>
</body>
</html>
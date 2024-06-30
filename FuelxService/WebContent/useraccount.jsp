<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>customer account </title>
	
	<link rel="stylesheet" type="text/css" href="styles/style.css">
    <link rel="stylesheet" type="text/css" href="styles/form.css">
	
</head>
<body>

  <header>
    <div class="logo">
      <img src="images/logo.png" alt="" height="40" width="60">
    </div>
    <nav>
      <ul>
        <li><a href="Home.jsp">Home</a></li>
        <li><a href="selectcar.jsp">Vehicles</a></li>
        <li><a href="Appointment.jsp">Appointments</a></li>
        <li><a href="login.jsp"><img src="images/profile.png" class="prof" height="40" width="40"></a></li>
      </ul>
    </nav>
  </header>
  <hr style="color:white;">
  
	<table class="table-view">
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="username" value="${cus.userName}"/>
	<c:set var="password" value="${cus.password}"/>
	
	<tr>
		<td>Customer ID</td>
		<td>${cus.id}</td>
	</tr>
	<tr>
		<td>Customer Name</td>
		<td>${cus.name}</td>
	</tr>
	<tr>
		<td>Customer Email</td>
		<td>${cus.email}</td>
	</tr>
	<tr>
		<td>Customer Phone</td>
		<td>${cus.phone}</td>
	</tr>
	<tr>
		<td>Customer User Name</td>
		<td>${cus.userName}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updatecustomer.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<c:url value="deletecustomer.jsp" var="cusdelete">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
	</c:url>
	<a href="${cusdelete}">
	<input type="button" name="delete" value="Delete Account">
	</a>
	
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
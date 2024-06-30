<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Appointment</title>
	<link rel="stylesheet" type="text/css" href="styles/style.css">
	<link rel="stylesheet" type="text/css" href="styles/newLogin.css">
	<link rel="stylesheet" type="text/css" href="styles/newForm.css">
	
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
	
	<div class="container">
	<table class = "table-view">
	<c:forEach var="apt" items="${aptDetails}">
	
	<c:set var="appointmentId" value="${apt.appointmentId}"/>
	<c:set var="vehicleType" value="${apt.vehicleType}"/>
	<c:set var="vehicleNumber" value="${apt.vehicleNumber}"/>
	<c:set var="model" value="${apt.model}"/>
	<c:set var="serviceType" value="${apt.serviceType}"/>
	<c:set var="prefferedDate" value="${apt.prefferedDate}"/>
	
	<tr>
		<td>Appointment ID</td>
		<td>${apt.appointmentId}</td>
	</tr>
	<tr>
		<td>Vehicle Type</td>
		<td>${apt.vehicleType}</td>
	</tr>
	<tr>
		<td>Vehicle Number</td>
		<td>${apt.vehicleNumber}</td>
	</tr>
	<tr>
		<td>Model</td>
		<td>${apt.model}</td>
	</tr>
	<tr>
		<td>Service Type</td>
		<td>${apt.serviceType}</td>
	</tr>
	<tr>
		<td>PrefferedDate</td>
		<td>${apt.prefferedDate}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updateAppointment.jsp" var="aptupdate">
		<c:param name="appointmentId" value="${appointmentId}"/>
		<c:param name="vehicleType" value="${vehicleType}"/>
		<c:param name="vehicleNumber" value="${vehicleNumber}"/>
		<c:param name="model" value="${model}"/>
		<c:param name="serviceType" value="${serviceType}"/>
		<c:param name="prefferedDate" value="${prefferedDate}"/>
	</c:url>
	
	<a href="${aptupdate}">
	<input class ="updtbtn" type="button" name="update" value="Change date">
	</a>
	
	<br>
	<c:url value="deleteAppointment.jsp" var="aptdelete">
		<c:param name="appointmentId" value="${appointmentId}" />
		<c:param name="vehicleType" value="${vehicleType}" />
		<c:param name="vehicleNumber" value="${vehicleNumber}" />
		<c:param name="model" value="${model}" />
		<c:param name="serviceType" value="${serviceType}" />
		<c:param name="prefferedDate" value="${prefferedDate}" />
	</c:url>
	<a href="${aptdelete}">
	<input class ="dltbtn" type="button" name="delete" value="Discard">
	</a>
	
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
  <p>Visit Our Page : <a href="Login-index.php">https://www.FxS.com</a></p>
  </div>
  <h6>Created By SE/OOP/2023/S2/MLB/WD/G181</h6>
  <script src="js/calendar.js"></script>
</footer>

</body>
</html>
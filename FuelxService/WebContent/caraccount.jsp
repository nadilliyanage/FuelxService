<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Car Account</title>

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
	<c:forEach var="c" items="${cDetails}">
	
	<c:set var="id" value="${c.id}"/>
	<c:set var="platenumber" value="${c.platenumber}"/>
	<c:set var="model" value="${c.model}"/>
	<c:set var="year" value="${c.year}"/>
	<c:set var="color" value="${c.color}"/>
	<c:set var="fueltype" value="${c.fueltype}"/>
	
	
	<tr>
		<td> Car ID</td>
		<td>${c.id}</td>
	</tr>
	<tr>
		<td>Plate Number</td>
		<td>${c.platenumber}</td>
	</tr>
	<tr>
		<td>Model</td>
		<td>${c.model}</td>
	</tr>
	<tr>
		<td>year </td>
		<td>${c.year}</td>
	</tr>
	<tr>
		<td> color</td>
		<td>${c.color}</td>
	</tr>
	<tr>  
		<td>Fuel Type</td>
		<td>${c.fueltype}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value="carupdate.jsp" var="cupdate">
		<c:param name="id" value="${id }"/>
		<c:param name="platenumber" value="${platenumber}"/>
		<c:param name="model" value="${model }"/>
		<c:param name="year" value="${year }"/>
		<c:param name="color" value="${color }"/>
		<c:param name="fueltype" value="${fueltype }"/>
	
	
	</c:url>
	
	
	<a href="${cupdate}">
	<input type="button" name="updatecar" value="Update data">
	</a>
	<br>
	<c:url value="deletecar.jsp" var="cdelete">
		<c:param name="id" value="${id }"/>
		<c:param name="platenumber" value="${platenumber}"/>
		<c:param name="model" value="${model }"/>
		<c:param name="year" value="${year }"/>
		<c:param name="color" value="${color }"/>
		<c:param name="fueltype" value="${fueltype }"/>
	</c:url>
	<a href="${ cdelete}">
	<input type="button" name="deletecar" value="Delete data">
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
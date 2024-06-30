package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.AppointmentDBUtil;


@WebServlet("/MakeAppointment")
public class MakeAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String vehicleType = request.getParameter("vehicleType");
		String vehicleNumber = request.getParameter("vehicleNumber");
		String model = request.getParameter("model");
		String serviceType = request.getParameter("serviceType");
		String prefferedDate = request.getParameter("prefferedDate");
		
		boolean isTrue;
		
		isTrue = AppointmentDBUtil.insertappointment(vehicleType, vehicleNumber, model, serviceType, prefferedDate);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Successfully created appointment');");
			out.println("location='Home.jsp'");								//return to Home page if making appointment successful
			out.println("</script>");
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Appointment creation unsuccessful');");
			out.println("location='makeAppointment.jsp'");					//return to make Appointment page if making appointment unsuccessful
			out.println("</script>");
		}
	}
}

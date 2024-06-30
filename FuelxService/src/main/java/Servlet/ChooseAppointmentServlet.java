package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.AppointmentDBUtil;
import JavaClasses.Appointment;

@WebServlet("/ChooseAppointmentServlet")
public class ChooseAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String vehicleNumber = request.getParameter("vehicleNumber");
		String model = request.getParameter("model");
		boolean isTrue;
		
		isTrue = AppointmentDBUtil.validate(vehicleNumber, model);
		
		if (isTrue == true) {
			List<Appointment> aptDetails = AppointmentDBUtil.getAppointment(vehicleNumber);
			request.setAttribute("aptDetails", aptDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewAppointment.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your vehicle number or model is incorrect');");
			out.println("location='chooseAppointment.jsp'");						//return to choose appointment page
			out.println("</script>");
		}
		
	}

}

package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.AppointmentDBUtil;
import JavaClasses.Appointment;


@WebServlet("/DeleteAppointmentServlet")
public class DeleteAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String appointmentId = request.getParameter("appointmentId");
		boolean isTrue;
		
		isTrue = AppointmentDBUtil.deleteAppointment(appointmentId);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("makeAppointment.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Appointment> aptDetails = AppointmentDBUtil.getAppointmentDetails(appointmentId);
			request.setAttribute("aptDetails", aptDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewAppointment.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}

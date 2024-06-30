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


@WebServlet("/UpdateAppointmentServlet")
public class UpdateAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String appointmentId = request.getParameter("appointmentId");
		String vehicleType = request.getParameter("vehicleType");
		String vehicleNumber = request.getParameter("vehicleNumber");
		String model = request.getParameter("model");
		String serviceType = request.getParameter("serviceType");
		String prefferedDate = request.getParameter("prefferedDate");
		
		boolean isTrue;
		
		isTrue = AppointmentDBUtil.updateAppointment(appointmentId, vehicleType, vehicleNumber, model, serviceType, prefferedDate);
		
		if(isTrue == true) {
			
			List<Appointment> aptDetails = AppointmentDBUtil.getAppointmentDetails(appointmentId);
			request.setAttribute("aptDetails", aptDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewAppointment.jsp");			//return to view appointment page with updated data if successfully updating appointment
			dis.forward(request, response);
		}
		else {
			List<Appointment> aptDetails = AppointmentDBUtil.getAppointmentDetails(appointmentId);
			request.setAttribute("aptDetails", aptDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewAppointment.jsp");			//return to view appointment page with data before updating if updating appointment unsuccessful
			dis.forward(request, response);
		}
		
	}

}

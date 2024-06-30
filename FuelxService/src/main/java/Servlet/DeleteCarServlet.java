package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.CarDBUtil;
import JavaClasses.Car;


@WebServlet("/DeleteCarServlet")
public class DeleteCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("cid");
		boolean isTrue;
		
		isTrue = CarDBUtil.deletecar(id);
		
		if(isTrue==true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("carinsert.jsp");
			dispatcher.forward(request,response);
		}
		else {
			List<Car> cDetails = CarDBUtil.getCarDetails(id);
			request.setAttribute("cDetails",cDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request,response);
			
		}
	}

}

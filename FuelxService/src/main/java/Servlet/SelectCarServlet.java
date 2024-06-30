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

import DBUtil.CarDBUtil;
import JavaClasses.Car;



@WebServlet("/SelectCarServlet")
public class SelectCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String platenumber = request.getParameter("platenumber");
		String model = request.getParameter("model");
		boolean isTrue;
		
		isTrue = CarDBUtil.validate(platenumber, model);
		
		if (isTrue == true) {
			List<Car> cDetails = CarDBUtil.getCarDetails(platenumber);
			request.setAttribute("cDetails", cDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("caraccount.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your plate number and model do not match');");
			out.println("location='selectcar.jsp'");
			out.println("</script>");
		}
		
	}

}


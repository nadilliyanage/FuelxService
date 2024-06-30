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


@WebServlet("/UpdateCarServle")
public class UpdateCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateCarServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("cid");
		String platenumber = request.getParameter("platenumber");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		String color = request.getParameter("color");
		String fueltype = request.getParameter("fueltype");
		
		
		boolean isTrue;
		
		isTrue = CarDBUtil.updatecar(id, platenumber, model, year, color, fueltype);
		
		if(isTrue== true) {
			
			List<Car> cDetails = CarDBUtil.getCarDetails(platenumber);
			request.setAttribute("cDetails", cDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("caraccount.jsp");
			dis.forward(request, response);
		}else {
			
			List<Car> cDetails = CarDBUtil.getCarDetails(platenumber);
			request.setAttribute("cDetails", cDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("caraccount.jsp");
			dis.forward(request, response);
		}
		
		
	}

}

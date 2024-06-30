package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.CarDBUtil;


@WebServlet("/Carinsert")
public class Carinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Carinsert() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String platenumber = request.getParameter("platenumber");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		String color = request.getParameter("color");
		String fueltype = request.getParameter("fueltype");
		
		boolean isTrue;
		isTrue = CarDBUtil.insertcar(platenumber, model, year, color, fueltype);
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Successfully created vehicle details');");
			out.println("location='selectcar.jsp'");
			out.println("</script>");
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Vehicle details creation unsuccessful  ');");
			out.println("location='carinsert.jsp'");
			out.println("</script>");
		}
		
	}

}

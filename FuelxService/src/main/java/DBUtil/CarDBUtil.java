package DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JavaClasses.Car;

public class CarDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	
	
	public static boolean validate(String platenumber, String model){
		
		
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from car where platenumber='"+platenumber+"' and model='"+model+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	//insert
	public static boolean insertcar(String platenumber, String model,String year, String color, String fueltype) {
		
		boolean isSuccess = false;
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into car values (0,'"+platenumber+"','"+model+"','"+year+"','"+color+"','"+fueltype+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
//update
	public static boolean updatecar(String id,String platenumber, String model,String year, String color, String fueltype) {
	
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update car set platenumber='"+platenumber+"', model='"+model+"',year='"+year+"',color='"+color+"',fueltype='"+fueltype+"'"
						+"where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess=false;
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return isSuccess;
	}
	
	//Retrieve
	public static List<Car> getCarDetails(String plateNumber){
		
		
		
		ArrayList<Car> c =new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from car where platenumber='"+plateNumber+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String platenumber =  rs.getString(2);
				 String model = rs.getString(3);
				 String year = rs.getString(4);
				 String color = rs.getString(5);
				 String fueltype = rs.getString(6);
				 
				 Car cr = new Car(id,platenumber,model,year,color,fueltype);
				 c.add(cr);
			 }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return c;
		}
	

	//delete
	public static boolean deletecar(String id) {
		int convID = Integer.parseInt(id);
		try {
			
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql= "delete from car where id='"+convID+"'";
				int r = stmt.executeUpdate (sql);
				
				
				if(r>0) {
					isSuccess = true;	
				}else {
					isSuccess= false;
				}
				
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}
		
		
	
	
	
	
	
	
}

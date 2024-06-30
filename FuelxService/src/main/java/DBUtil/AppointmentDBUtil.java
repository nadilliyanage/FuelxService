package DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JavaClasses.Appointment;

public class AppointmentDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	
	//validate the vehicleNumber and model from database
	public static boolean validate(String vehicleNumber, String model) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from appointment where vehicleNumber='"+vehicleNumber+"' and model='"+model+"'";
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
	
	
	//get the appointment
	public static List<Appointment> getAppointment(String vehicleNumber) {
		
		ArrayList<Appointment> appointment = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from appointment where vehicleNumber='"+vehicleNumber+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int appointmentId = rs.getInt(1);
				String vehicleType = rs.getString(2);
				String vehicleNumber1 = rs.getString(3);
				String model = rs.getString(4);
				String serviceType = rs.getString(5);
				String prefferedDate = rs.getString(6);
				
				Appointment apt = new Appointment(appointmentId,vehicleType,vehicleNumber1,model,serviceType,prefferedDate);
				appointment.add(apt);
			}
			
		} catch (Exception e) {
			
		}
		
		return appointment;	
	}
    
	
	//insert the new appointment to the database
    public static boolean insertappointment(String vehicleType, String vehicleNumber, String model, String serviceType, String prefferedDate) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into appointment values (0,'"+vehicleType+"','"+vehicleNumber+"','"+model+"','"+serviceType+"','"+prefferedDate+"')";
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
    
    
    //update the existing appointment
    public static boolean updateAppointment(String appointmentId, String vehicleType, String vehicleNumber, String model, String serviceType, String prefferedDate) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update appointment set vehicleType='"+vehicleType+"',vehicleNumber='"+vehicleNumber+"',model='"+model+"',serviceType='"+serviceType+"',prefferedDate='"+prefferedDate+"'"
    				+ "where appointmentId='"+appointmentId+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    
    public static List<Appointment> getAppointmentDetails(String appointmentId) {
    	
    	int convertedID = Integer.parseInt(appointmentId);
    	
    	ArrayList<Appointment> apt = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from appointment where appointmentId='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int appointmentId1 = rs.getInt(1);
    			String vehicleType = rs.getString(2);
    			String vehicleNumber = rs.getString(3);
    			String model = rs.getString(4);
    			String serviceType = rs.getString(5);
    			String prefferedDate = rs.getString(6);
    			
    			Appointment a = new Appointment(appointmentId1,vehicleType,vehicleNumber,model,serviceType,prefferedDate);
    			apt.add(a);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return apt;	
    }
    
    
    //delete created appointment
    public static boolean deleteAppointment(String appointmentId) {
    	
    	int convId = Integer.parseInt(appointmentId);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from appointment where appointmentId='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
}

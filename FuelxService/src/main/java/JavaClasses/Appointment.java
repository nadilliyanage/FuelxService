package JavaClasses;

public class Appointment {

	private int appointmentId;
    private String vehicleType;
    private String vehicleNumber;
    private String model;
    private String serviceType;
    private String prefferedDate;
    
    //set constructor
	public Appointment(int appointmentId, String vehicleType, String vehicleNumber, String model, String serviceType, String prefferedDate) {
		super();
		this.appointmentId = appointmentId;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.serviceType = serviceType;
		this.prefferedDate = prefferedDate;
	}
	
	public int getAppointmentId() {
		return appointmentId;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public String getPrefferedDate() {
		return prefferedDate;
	}
	
}

package JavaClasses;

public class Car {
	private int id;
	private String platenumber;
	private String model;
	private String year;
	private String color;
	private String fueltype;
	
	//set constructor
	public Car(int id, String platenumber, String model, String year, String color, String fueltype) {
		
		this.id = id;
		this.platenumber = platenumber;
		this.model = model;
		this.year = year;
		this.color = color;
		this.fueltype = fueltype;
	}

	public int getId() {
		return id;
	}

	public String getPlatenumber() {
		return platenumber;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public String getFueltype() {
		return fueltype;
	}


	
	

	


	

}

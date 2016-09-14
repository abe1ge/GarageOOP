
public abstract class Vehicle {

	//attributes
	private int passenger;
	private int age;
	private int vehicleID;
	private String vehcileType;
	private int fixCost;
	private boolean isFixed;
	
	//constructor
	public Vehicle(int vehicleId, String vehcileType, int passenger, int age) {
		this.vehicleID = vehicleId;
		this.vehcileType = vehcileType;
		this.age = age;
		this.passenger = passenger;
		this.fixCost = 0;
		this.isFixed = false;
		// TODO Auto-generated constructor stub
	}

	//methods
	public int getPassenger() {
		return passenger;
	}

	public String getVehcileType() {
		return vehcileType;
	}

	public void setVehcileType(String vehcileType) {
		this.vehcileType = vehcileType;
	}

	public boolean isFixed() {
		return isFixed;
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getFixCost() {
		return fixCost;
	}

	public void setFixCost(int fixCost) {
		this.fixCost = fixCost;
	}

	public int getVehicleID() {
		return vehicleID;
	}
	

}

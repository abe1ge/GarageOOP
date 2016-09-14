
public class Train extends Vehicle {
	
	//attributes
	private int speed;

	//constructor
	public Train(int vehicleId, int passenger, int age, int speed) {
			
		super(vehicleId,"Train", passenger, age);
		
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}
	
	//methods
	public double calcost()
	{
		//calcualte fix cost
		return 0.0;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

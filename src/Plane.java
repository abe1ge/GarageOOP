
public class Plane extends Vehicle {

	//attributes
	private int numEngine;
	
	//constructor 
	public Plane(int vehicleId,int passenger, int age, int numEngine) {
		super(vehicleId, "Plane", passenger, age);
		
		this.numEngine = numEngine;
		// TODO Auto-generated constructor stub
	}
	
	//methods
	public double calcost()
	{
		//calcualte fix cost
		return 0.0;
	}

	public int getNumEngine() {
		return numEngine;
	}

	public void setNumEngine(int numEngine) {
		this.numEngine = numEngine;
	}

}


public class Tram extends Vehicle {
	//attributes
	private double weight;

	//constructor
	public Tram(int vehicleId, int passenger, int age, double weight) {
		super(vehicleId, "Tram", passenger, age);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}
	
	//methods
	public double calcost()
	{
		//calcualte fix cost
		return 0.0;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}

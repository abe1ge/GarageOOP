import java.util.ArrayList;
import java.util.Iterator;


public class Garage {

	//attributes
	private String garageName;
	ArrayList<Vehicle> garageVehicle;
	private int currentID;
	//constructor
	public Garage(String garageName) {
		this.garageName = garageName;
		garageVehicle = new ArrayList<Vehicle>();
		// TODO Auto-generated constructor stub
	}
	
	//methods
	
	//add vehicles to the garage
	public void addVehicle(Vehicle vehicle)
	{
		//add a vehicle to the garage
		garageVehicle.add(vehicle);
		currentID ++;
	}
	
	public void addTrain(int passengers, int age, int speed )
	{
		//add a Train to the garage
		garageVehicle.add(new Train(currentID, passengers, age, speed ));
		currentID ++;
	}
	
	public void addTram(int passengers, int age, double weight)
	{
		//add a Tram to the garage
		garageVehicle.add(new Tram (currentID, passengers, age, weight));
		currentID ++;
	}
	
	public void addPlane(int passengers, int age, int numEngine)
	{
		//add a Plane to the garage
		garageVehicle.add(new Plane (currentID, passengers, age, numEngine));
		currentID ++;
	}
	
	//return vehicle details
	
	public String showAllVehicle()
	{
		
		StringBuilder av = new StringBuilder();
		
		for (Vehicle allV : garageVehicle)
		{
			switch (allV.getVehcileType())
			{
			case"Plane" : 
				av.append(planeDetails((Plane) allV) + "\n") ;
				break;
			case "Train" : 
				av.append(trainDetails((Train) allV) + "\n");
				break;
			case "Tram" : 
				av.append(tramDetails((Tram) allV) + "\n") ;
				break;
			default : 
				av.append("unidentified Vehicle" + "\n") ;
				break;
			}
		}

		return av.toString();
	}

	public String planeDetails(Plane plane)
	{
		//return plain details
		StringBuilder vd = new StringBuilder();
		
		vd.append("Plane ID: " + plane.getVehicleID() + "\n");
		vd.append("Number of passenger: " + plane.getPassenger() + "\n");
		vd.append("Plans age: " + plane.getAge() + "\n");
		vd.append("Number of Engins: " + plane.getNumEngine() + "\n");
		
		return vd.toString();
	}
	
	public String trainDetails(Train train)
	{
		//return train details
		StringBuilder vd = new StringBuilder();
		
		vd.append("Train ID: " + train.getVehicleID() + "\n");
		vd.append("Number of passenger: " + train.getPassenger() + "\n");
		vd.append("Plans age: " + train.getAge() + "\n");
		vd.append("Top Speed: " + train.getSpeed() + "\n");
		
		return vd.toString();
	}
	
	public String tramDetails(Tram tram)
	{
		//return tram details
		StringBuilder vd = new StringBuilder();
		
		vd.append("Tram ID: " + tram.getVehicleID() + "\n");
		vd.append("Number of passenger: " + tram.getPassenger() + "\n");
		vd.append("Plans age: " + tram.getAge() + "\n");
		vd.append("Weight: " + tram.getWeight() + "\n");
		
		return vd.toString();
	}
	
	//remove a vehicle
	public void removeVehicle(Vehicle vh)
	{
		garageVehicle.remove(vh);
		//remove a vehicle from the garage
	}
	
	public void removeVehicle(int id, String vType)
	{
		//remove vehicles by id and vehcile type
		int idx = 0;
		
		while (idx < garageVehicle.size())
		{
			if(garageVehicle.get(idx).getVehicleID() == id
					&& garageVehicle.get(idx).getVehcileType() == vType)
			{
				garageVehicle.remove(idx);
			}else
			{
				idx ++;
			}
		}
	}
	
	public void removeVehicle()
	{
		//remove all vehicle 
	int idx = 0;
		
		while (idx < garageVehicle.size())
		{
			garageVehicle.remove(idx);
			idx ++;
		}
	}
	
	public void fixVehicle()
	{
		//fix a vehicle 
	}
	
	public void CalAllVehicle()
	{
		//itterate through all vehicle calculating each one
	}
	
	

}


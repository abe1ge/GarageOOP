
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garage testGarage = new Garage("auto Fix");
		
		
		testGarage.addTram(50, 2, 305);	
		testGarage.addPlane(15, 2, 2);
		testGarage.addTrain(200, 15, 150);
		
		testGarage.removeVehicle(1 , "Plane");
		//testGarage.removeVehicle(2 , "Train");
		
		System.out.println(testGarage.showAllVehicle());
		
		testGarage.removeVehicle();
		
		System.out.println(testGarage.showAllVehicle() + "all is gone");
		
	}

}

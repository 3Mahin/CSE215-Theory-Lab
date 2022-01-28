package Revision;

public class Car extends Features{
	
	public int numberofDoors = 4;
	private int numberofWheels = 4;
	protected int numberofseats = 5;
	
	Car(){
		numberofDoors = 1;
		numberofWheels = 2;
	}
	
	Car(int doors, int wheels){
		numberofDoors = doors;
		numberofWheels = wheels;
	}
	
	void stop() {
		System.out.println("Stopped");
	}
	void horn() {
		System.out.println("Horned");
	}
	void horn(int n) {
		for(int i= 0; i<n; i++) {
			System.out.println("Horned");
		}
	}
	
	void run() {
		System.out.println("Running");
	}
	void engineStart() {
		System.out.println("Engine Started");
	}
	
	//setter method
	void setnumberofWheels(int n) {
		numberofWheels = n;
	}
	//getter method
	int getnumberofWheels() {
		return numberofWheels;
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}
	
	

}

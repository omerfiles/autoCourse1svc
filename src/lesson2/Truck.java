package lesson2;

public class Truck extends Vehicle {
	
	
	int allowedWeight;
	
	String licenseType;
	
	int numberOfTrailers;

	@Override
	void move() {
		System.out.println("Moving like a truck");
	}
	
	
	

}

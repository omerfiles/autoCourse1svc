package lesson3;

import lesson2.Vehicle;

public class forLoop {

	public static void main(String[] args) {
		forLoopSample();
		
		badForLoop();
	}

	public static void forLoopSample() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

	public static void getVehiclesFromDB() {
		Vehicle[] vehicles = new Vehicle[10];

		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i] = new Vehicle();
			vehicles[i].setId(getRandomIdFromDB());
		}
		
		badForLoop();
	}

	private static int getRandomIdFromDB() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void badForLoop() {
		for (int i = 0; i < 10; i++) {
			i = 0;
		}
	}
	
	public static void reverseForLoop(){
		
	}

}

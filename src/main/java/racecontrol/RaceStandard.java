package racecontrol;

public class RaceStandard extends Race {

	int time = 180;

	public RaceStandard() {

	}

	public RaceStandard(String name, int numCars) {
		super(name, numCars);
	}

	public RaceStandard(String name, int numCars, int time) {
		super(name, numCars);
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Star race
	 * 
	 * @param coches
	 */

	public void startRace() {
		Car car = new Car();
		Garage garage = new Garage();
		
		this.registerData();
		

		System.out.println("\n" + "░██████╗████████╗░█████╗░██████╗░████████╗\n"
				+ "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝\n" + "╚█████╗░░░░██║░░░███████║██████╔╝░░░██║░░░\n"
				+ "░╚═══██╗░░░██║░░░██╔══██║██╔══██╗░░░██║░░░\n" + "██████╔╝░░░██║░░░██║░░██║██║░░██║░░░██║░░░\n"
				+ "╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░\n" + "===========================================");

		System.out.println("===========================");
		
		
		for (int i = 0; i < this.numCars; i++) {
			
			int rCar = Utils.ramdomNuber(0, this.numCars);
		
			for (int j = 0; j < Utils.garages.size() - 1; j++) {
				
				System.out.println(Utils.garages.get(j));
				
			}
		}
		
		
	
		

	}

}

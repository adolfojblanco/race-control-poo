package racecontrol;

import java.util.ArrayList;
import java.util.Iterator;


public class RacingStandar extends Racing {

	private int time = 180;

	private int numCoches;

	public RacingStandar() {

	}

	public RacingStandar(ArrayList<Car> cars, ArrayList<Garage> garages, Car winner, int time, int numCoches) {
		super(cars, garages, winner);
		this.time = time;
		this.numCoches = numCoches;
	}

	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * @return the numCoches
	 */
	public int getNumCoches() {
		return numCoches;
	}

	/**
	 * @param numCoches the numCoches to set
	 */
	public void setNumCoches(int numCoches) {
		this.numCoches = numCoches;
	}

	public void startStandarRace() {

		System.out.println("\n" + "░██████╗████████╗░█████╗░██████╗░████████╗\n"
				+ "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝\n" + "╚█████╗░░░░██║░░░███████║██████╔╝░░░██║░░░\n"
				+ "░╚═══██╗░░░██║░░░██╔══██║██╔══██╗░░░██║░░░\n" + "██████╔╝░░░██║░░░██║░░██║██║░░██║░░░██║░░░\n"
				+ "╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░\n" + "===========================================");

		Car car = new Car();
		int coches = car.getCars().size();
		Utils.ramdomNuber(0, coches -1 );
		
		for (Car c : car.getCars()) {
			System.out.println(c);
		}
		System.out.println("===========================");
		for (int i = 0; i < coches; i++) {
			
			int distancia = 0;
			Car c = car.getCars().get(i);
			c.setDistance(distancia);
			System.out.println(c);
		}
		


	}

}

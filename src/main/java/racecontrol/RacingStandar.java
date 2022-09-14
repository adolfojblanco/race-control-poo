package racecontrol;

import java.util.ArrayList;


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

		System.out.println("===========================");

	}

}

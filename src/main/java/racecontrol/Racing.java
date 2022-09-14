package racecontrol;

import java.util.ArrayList;

public class Racing {
	
	
	protected ArrayList<Car> cars = new ArrayList<Car>();
	
	protected ArrayList<Garage> garages = new ArrayList<Garage>();
	
	protected Car winner;
	

	public Racing() {
	}

	public Racing(ArrayList<Car> cars, ArrayList<Garage> garages, Car winner) {
		this.cars = cars;
		this.garages = garages;
		this.winner = winner;
	}

	/**
	 * @return the cars
	 */
	public ArrayList<Car> getCars() {
		return cars;
	}

	/**
	 * @param cars the cars to set
	 */
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	/**
	 * @return the garages
	 */
	public ArrayList<Garage> getGarages() {
		return garages;
	}

	/**
	 * @param garages the garages to set
	 */
	public void setGarages(ArrayList<Garage> garages) {
		this.garages = garages;
	}

	/**
	 * @return the winner
	 */
	public Car getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(Car winner) {
		this.winner = winner;
	}
	
	

}

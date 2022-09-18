package racecontrol;

import java.util.ArrayList;
import java.util.Scanner;

public class Race {

	private String name;

	protected int numCars;

	protected Car winner;

	protected ArrayList<Car> podium = new ArrayList<Car>();

	protected ArrayList<Car> rCars = new ArrayList<Car>();

	protected ArrayList<Garage> rGarages = new ArrayList<Garage>();

	public Race() {

	}

	public Race(String name, int numCars, Car winner, ArrayList<Car> podium, ArrayList<Car> rCars,
			ArrayList<Garage> rGarages) {
		super();
		this.name = name;
		this.numCars = numCars;
		this.winner = winner;
		this.podium = podium;
		this.rCars = rCars;
		this.rGarages = rGarages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumCars() {
		return numCars;
	}

	public void setNumCars(int numCars) {
		this.numCars = numCars;
	}

	public Car getWinner() {
		return winner;
	}

	public void setWinner(Car winner) {
		this.winner = winner;
	}

	public ArrayList<Car> getPodium() {
		return podium;
	}

	public void setPodium(ArrayList<Car> podium) {
		this.podium = podium;
	}

	public ArrayList<Car> getrCars() {
		return rCars;
	}

	public void setrCars(ArrayList<Car> rCars) {
		this.rCars = rCars;
	}

	public ArrayList<Garage> getrGarages() {
		return rGarages;
	}

	public void setrGarages(ArrayList<Garage> rGarages) {
		this.rGarages = rGarages;
	}

	/**
	 * Initial Preparation for the race or tournament
	 */

	public void registerData() {
		System.out.println("===========================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la carrera: ");
		this.name = sc.nextLine();
		System.out.println("===========================");
		System.out.println("Introduce el numero de coches que participaran: ");
		this.numCars = sc.nextInt();
		System.out.println("===========================");
	}

}

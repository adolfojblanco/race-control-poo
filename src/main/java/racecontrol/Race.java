package racecontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Race {

	private String name;

	protected int numCars;

	protected  ArrayList<Car> podium = new ArrayList<Car>();

	protected ArrayList<Car> rCars = new ArrayList<Car>();

	protected ArrayList<Garage> rGarages = new ArrayList<Garage>();

	public Race() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumCars() {
		return this.numCars;
	}

	public void setNumCars(int numCars) {
		this.numCars = numCars;
	}



	public ArrayList<Car> getPodium() {
		return this.podium;
	}

	public void setPodium(ArrayList<Car> podium) {
		this.podium = podium;
	}

	public ArrayList<Car> getrCars() {
		return this.rCars;
	}

	public void setrCars(ArrayList<Car> rCars) {
		this.rCars = rCars;
	}

	public ArrayList<Garage> getrGarages() {
		return this.rGarages;
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

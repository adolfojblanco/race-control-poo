/**
 * 
 */
package racecontrol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author adolfob
 *
 */
public class Garage {

	private String name;

	private ArrayList<Car> cars;
	
	static ArrayList<Garage> garages = new ArrayList<Garage>();
	
	
	public Garage() {

	}

	public Garage(String name) {
		this.name = name;
	}

	public Garage(String name, ArrayList<Car> cars) {
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Garage [" + name +"]";
	}
	
	
	/**
	 * Create new garage
	 */

	public Garage newGarage() {
		Scanner key = new Scanner(System.in);
		System.out.println("Introduce el nombre del garaje: ");
		String name = key.nextLine();
		Garage garage = new Garage(name);
		this.garages.add(garage);
		return garage;
	}
	
	
	/**
	 * List of garages
	 */
	public void garageList() {
		int contador = 0;
		
		if(garages == null || garages.isEmpty()) {
			System.out.println("No hay garajes registrados.");
			this.newGarage();
		}
		
		for (Garage g : this.garages) {
			System.out.println(contador++ + ". " + g.getName());
		}
		
	}
	
	/**
	 * Select Garage
	 * @return garage
	 */
	
	public Garage selectGarage() {
		System.out.println("Seleccciona un garage: ");
		Scanner key = new Scanner(System.in);
		int g = key.nextInt();
		return this.garages.get(g);
	}
	
	/**
	 * Auto generated garage
	 * @param quantity
	 */
	public void randomGarage(int quantity) {		
		for (int i = 0; i < quantity; i++) {
			String name = "Garage " + i;
			Garage garage = new Garage(name);
			this.garages.add(garage);
		}
		
	}
	/**
	 * Get Garage
	 * @param garage
	 * @return garage
	 */
	public Garage getGarage(int garage) {
		return this.garages.get(garage);
	}

}

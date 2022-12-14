/**
 * 
 */
package racecontrol;

import java.util.ArrayList;

/**
 * @author adolfob
 *
 */
public class Garage {

	private String name;

	private ArrayList<Car> cars = new ArrayList<Car>();

	public Garage() {

	}

	public Garage(String name) {
		this.name = name;
	}

	public Garage(String name, ArrayList<Car> cars) {
		this.name = name;
		cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		cars = cars;
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}
	
	/**
	 * Show a car list
	 */
	public void showCars() {
		for (Car car : cars) {
			System.out.println("|" + car.getGarageName() + "|" + car.getBrand() + "|"+  car.getModel());
		}
	}

	/**
	 * Random list of garages
	 * 
	 * @param quantity
	 */
	public void randomGarage() {
		System.out.println("===========================");
		System.out.println("=== Generando Garages: ====");
		System.out.println("===========================");
		
		String[] escuderias = { "Mercedes", "Red Bull", "McLaren", "Aston Martin", "Alpine", "Ferrari", "AlphaTauri", "Alfa Romeo", "Haas", "Williams" };
		
		for (int i = 0; i < escuderias.length; i++) {
			String name = escuderias[i];
			Garage garage = new Garage(name);
			Utils.garages.add(garage);
			System.out.println(garage.getName());
		}

	}

	/**
	 * Pring a garage list
	 */
	public void printGarageList() {
		int contador = 1;
		System.out.println("===========================");
		System.out.println("=== Listado de Garages: ===");
		System.out.println("===========================");

		for (Garage g : Utils.garages) {
			System.out.println( contador++ + "|"+g.getName() + " | Coches: " + g.getCars().size());
		}
	}

}

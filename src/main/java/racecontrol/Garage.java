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

	private ArrayList<Car> Cars = new ArrayList();

	public Garage() {

	}

	public Garage(String name) {
		this.name = name;
	}

	public Garage(String name, ArrayList<Car> cars) {
		this.name = name;
		Cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Car> getCars() {
		return Cars;
	}

	public void setCars(ArrayList<Car> cars) {
		Cars = cars;
	}
	
	public void addCar(Car car) {
		this.Cars.add(car);
	}
	
	
	

	/**
	 * Random list of garages
	 * @param quantity
	 */
	public void randomGarage(int quantity) {
		System.out.println("===========================");
		System.out.println("=== Generando Garages: ====");
		System.out.println("===========================");
		for (int i = 0; i < quantity; i++) {
			String name = "Garage " + i;
			Garage garage = new Garage(name);
			Utils.garages.add(garage);
			System.out.println(garage.getName());
		}

	}
	
	public void garageList() {
		int contador = 0;
		System.out.println("===========================");
		System.out.println("=== Listado de Garages: ===");
		System.out.println("===========================");
		
		for (Garage g : Utils.garages) {
			
			System.out.println(g.getName() + " | Coches: " +  g.getCars().size());
		}
	}

}

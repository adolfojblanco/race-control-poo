/**
 * 
 */
package racecontrol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author adolfob
 *
 */

public class Car {

	private String brand;

	private String model;

	private Garage garage;

	private int distance;

	private final int MAX_SPEED = 250;

	static ArrayList<Car> cars = new ArrayList<Car>();

	public Car() {
	}

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Car(String brand, String model, Garage garage) {
		this.brand = brand;
		this.model = model;
		this.garage = garage;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the garage
	 */
	public Garage getGarage() {
		return garage;
	}

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(Garage garage) {
		this.garage = garage;
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
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Car [" + brand + ", " + model + " " + this.getGarage() +"], " + "distancia = [" + distance + "]";
	}

	/**
	 * New Car
	 */

	public void newCar() {
		Scanner key = new Scanner(System.in);
		System.out.println("Introduce la marca: ");
		String brand = key.nextLine();

		System.out.println("Introduce el modelo: ");
		String model = key.nextLine();
		Car car = new Car(brand, model);
		garage.garageList();
		Garage g = garage.selectGarage();
		car.setGarage(g);
		this.cars.add(car);
	}

	/**
	 * Cars list
	 */

	public void carsList() {
		System.out.println("==========================");
		System.out.println("=== Listado de coches: ===");
		System.out.println("==========================");
		for (Car c : this.cars) {
			System.out.println(c.getModel() + " " + c.getBrand() + " " + c.getGarage());
		}

	}
	
	public void ramdomCars(int quantity) {
		

		for (int i = 0; i < quantity; i++) {
			String b = "Marca " + i;
			String m = "Model " + i;
			int ramdom = Utils.ramdomNuber(0, 9);

			Garage g = new Garage();
			Car car = new Car(b, m, g.getGarage(ramdom));
			this.cars.add(car);
		}
	}
	
	

}

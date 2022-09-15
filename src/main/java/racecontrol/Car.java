/**
 * 
 */
package racecontrol;

import java.util.ArrayList;

/**
 * @author adolfob
 */

public class Car {

	private String brand;

	private String model;

	private String garageName;

	private int distance;

	private int velocity;

	private final int MAX_SPEED = 250;

	public Car() {
	}

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Car(String brand, String model, String garageName) {
		super();
		this.brand = brand;
		this.model = model;
		this.garageName = garageName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getGarageName() {
		return garageName;
	}

	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getVelocity() {
		// d = v * t
		
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", Escuderia=" + garageName + ", distance=" + distance
				+ ", velocity=" + velocity + " Km/h" + "]";
	}

	/**
	 * New Car
	 */

	public void ramdomCars(int quantity) {
		int contador = 0;
		String marca[] = { "Alfa Romeo", "Isuzu", "Ferrari", "Skoda", "Mazda", "Nissan", "Renault", "Toyota" };
		String modelo[] = { "F8", "Aveo", "Giulia", "CX-30", "Captur" };

		System.out.println("===========================");
		System.out.println("==== Generando Coches: ====");
		System.out.println("===========================");

		for (int i = 0; i < quantity; i++) {

			int ramdomg = Utils.ramdomNuber(0, Utils.garages.size() - 1);
			int ramdomb = Utils.ramdomNuber(0, marca.length);
			int ramdomm = Utils.ramdomNuber(0, modelo.length);

			this.brand = marca[ramdomb];
			this.model = modelo[ramdomm];
			this.garageName = Utils.garages.get(ramdomg).getName();

			Garage garage = Utils.garages.get(ramdomg);

			Car car = new Car(brand, model, garageName);
			garage.addCar(car);
			System.out.println(contador++ + ". Marca: " + car.getBrand() + ", Modelo: " + car.getModel() + ", Garage: "
					+ car.getGarageName());

		}

	}

	/**
	 * Cars in Garage
	 */
	public void carsList() {
		Garage garage = new Garage();
		int contador = 0;
		System.out.println("===========================");
		System.out.println("=== Listado de Coches: ===");
		System.out.println("===========================");

		for (Garage g : Utils.garages) {
			g.showCars();

		}

	}

	public ArrayList<Car> lisfOfCars() {
		Garage g = new Garage();
		ArrayList<Car> cars = new ArrayList<Car>();

		for (Car car : g.getCars()) {
			System.out.println(car);
		}

		return cars;

	}

}

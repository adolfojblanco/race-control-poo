package racecontrol;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author adolfob
 */

public class Car {

	private String brand;

	private String model;
	
	private int point;

	private String garageName;
	
	private Garage garage;

	private int distance = 0;


	private int velocity = 100;

	private final int MAX_SPEED = 250;

	public Car() {
	}

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Car(String brand, String model, String garageName) {
		this.brand = brand;
		this.model = model;
		this.garageName = garageName;
	}
	
	public Car(String brand, String model, String garageName, Garage garage) {
		this.brand = brand;
		this.model = model;
		this.garageName = garageName;
		this.garage = garage;
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
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	

	public Garage getGarage() {
		return this.garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}
	
	

	public int getMAX_SPEED() {
		return this.MAX_SPEED;
	}
	
	
	

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Coche [Marca: " + brand + ", Modelo: " + model + ", Escuderia: " + garageName + ", Recorrido: " + distance + " Km"
				+ ", Velocidad: " + velocity + " Km/h" + "]";
	}

	
	/*************************** Metodos propios **************************/
	
	/**
	 * Generate a ramdom cars
	 */

	public void ramdomCars() {
		int quantity = 10;
		int contador = 1;
		
		String marca[] = { "Alfa Romeo", "Isuzu", "Ferrari", "Skoda", "Mazda", "Nissan", "Renault", "Toyota", "BMW", "Ford", "Chevrolet" };
		String modelo[] = { "F8", "Aveo", "Giulia", "CX-30", "Captur", "A3", "B5", "Yaris", "Picanto", "A5" };

		System.out.println("===========================");
		System.out.println("==== Generando Coches: ====");
		System.out.println("===========================");
		
		
		
		
		for (int i = 0; i < 10; i++) {
			Garage garage = Utils.garages.get(i);
			this.brand = marca[i];
			this.model = modelo[i];
			this.garageName = garage.getName();
			this.garage = garage;
			Car car = new Car(brand, model, garageName, garage);
			garage.addCar(car);
			System.out.println(contador++ + ". Marca: " + car.getBrand() + ", Modelo: " + car.getModel() + ", Garage: "
					+ car.getGarageName());
		}

	}

	/**
	 * Print list of cars in garages
	 * 
	 * @return
	 */
	public void printListfOfCars() {
		int contador = 1;
		for (Garage garage : Utils.garages) {

			for (Car car : garage.getCars()) {
				System.out.println(contador++ + ". Marca: " + car.getBrand() + ", Modelo: " + car.getModel() + ", Garage: "
						+ car.getGarageName());
			}

		}

	}
	
	/**
	 * Return car list
	 * @return
	 */
	
	public ArrayList<Car> carsList() {
		ArrayList<Car> cars = new ArrayList<Car>();
		
		for (Garage garage : Utils.garages) {

			for (Car car : garage.getCars()) {
				cars.add(car);
			}

		}
		return cars;

	}
	
	/**
	 * Acelerar o desaelerar coche.
	 */
	
	public void acelerateCar() {
		int r = Utils.ramdomNuber(0, 2);
		int v = 0;
		boolean opt[] = { true, false};
		
		if(opt[r] && this.velocity >= 20) {
			v = this.getVelocity() - 10;
		}else {
			v = this.getVelocity() + 10;
			this.setPoint(this.point +=1);
		}
		this.setVelocity(v);
	}
	
	
	/**
	 * Calculate distance
	 */
	
	public void calculateDistance(int time) {
		
		int d = this.getVelocity() * time;
		
		this.setDistance(this.distance + d);
		
	}



}

/**
 * 
 */
package racecontrol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author adolfob
 *
 */

public class Car {

	private String brand;

	private String model;

	private String garageName;

	private int distance;
	
	private int speed;

	private final int MAX_SPEED = 250;

	public Car() {
	}
	
	

	public Car(String brand, String model, String garageName) {
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
	
	
	public void generateCars(int number) {
		
		for (int i = 0; i < number; i++) {
			
			this.setBrand("Marca");
			this.setModel("Modelo");
			
			
			
		}
		
		
		Car car = new Car();
		
	}


	
	
	

}

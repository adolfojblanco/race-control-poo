/**
 * 
 */
package racecontrol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author adolfob
 *
 */
public class Main {

	private static Scanner key;

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		boolean exit = false;
		Garage garage = new Garage();
		Car car = new Car();
		RaceStandard rStandard = new RaceStandard();

		do {
			System.out.println("============================");
			System.out.println("== Selecciona una Opción: ==");
			System.out.println("============================");

			System.out.println(
					" 1. Registrar Garaje \n 2. Registrar Coche \n 3. Listado de Garajes \n 4. Listado Coches \n 5. Generar Garages y Coches \n 6. Carrera Standar \n 0. Salir");
			System.out.println("===========================");

			key = new Scanner(System.in);

			int option = key.nextInt();
			switch (option) {

			case 1:
				//garage.newGarage();
				break;
				
				
			case 2:
				break;

			case 3:
				garage.garageList();
				break;

			case 4:
				car.carsList();
				break;
				
			case 5:

				if(Utils.garages.isEmpty() || Utils.garages == null) {
					garage.randomGarage(10);
				}
				
				car.ramdomCars(20);
				break;
				
			case 6:
				
				
				if(Utils.garages == null || Utils.garages.isEmpty()) {
					garage.randomGarage(10);
				}
				
				if(garage.getCars() == null || garage.getCars().isEmpty()) {
					car.ramdomCars(10);
				}
				
				rStandard.startRace();
				
				break;

			case 0:
				exit = true;
				System.out.println("Hasta Luego");
			}

		} while (!exit);
		
	}
	

}

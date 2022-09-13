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

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		boolean exit = false;
		Garage garage = new Garage();
		Car car = new Car();
		RacingStandar racing = new RacingStandar();

		do {
			System.out.println("============================");
			System.out.println("== Selecciona una Opción: ==");
			System.out.println("============================");

			System.out.println(
					" 1. Registrar Garaje \n 2. Registrar Coche \n 3. Listado de Garajes \n 4. Listado Coches \n 5. Generar Garages y Coches \n 6. Carrera Standar \n 0. Salir");
			System.out.println("===========================");

			Scanner key = new Scanner(System.in);

			int option = key.nextInt();
			switch (option) {

			case 1:
				garage.newGarage();
				break;
				
				
			case 2:

				key.nextLine();
				System.out.println("Introduce la marca: ");
				String brand = key.nextLine();

				System.out.println("Introduce el modelo: ");
				String model = key.nextLine();
				Car car1 = new Car(brand, model);
				garage.garageList();

				garage.selectGarage();
				car.setGarage(garage);
				

				break;

			case 3:
				System.out.println("===========================");
				System.out.println("=== Listado de Garages: ===");
				System.out.println("===========================");
				int contador = 0;
				garage.garageList();
				break;

			case 4:
				car.carsList();
				break;
				
			case 5:
				
				if(garage == null || garage.getGarages().isEmpty()) {
					garage.randomGarage(10);
				}
				
				car.ramdomCars(10);
				
				racing.startStandarRace();
				break;

			case 0:
				exit = true;
				System.out.println("Hasta Luego");
			}

		} while (!exit);
		
	}
	

}

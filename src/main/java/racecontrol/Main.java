/**
 * 
 */
package racecontrol;

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
					" 1. Listado de Escuderias \n 2. Listado Coches \n 3. Generar Escuderias y Coches \n 4. Carrera Standar \n 0. Salir");
			System.out.println("===========================");

			key = new Scanner(System.in);

			int option = key.nextInt();
			switch (option) {

			case 1:
				garage.printGarageList();
				break;

			case 2:
				car.printListfOfCars();
				break;
				
			case 3:

				if(Utils.garages.isEmpty() || Utils.garages == null) {
					garage.randomGarage(10);
				}
				
				if(car.carsList().isEmpty() || car.carsList() == null) {
					System.out.println("Entramos");
				}
				
				break;
				
			case 4:
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
				break;
			
			default:
				System.out.println("Seleccion invvalida");
				
			}

		} while (!exit);
		
	}
	

}

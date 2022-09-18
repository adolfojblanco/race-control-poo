package racecontrol;

import java.util.ArrayList;

public class RaceStandard extends Race {

	private int time = 180;

	public RaceStandard() {

	}

	public RaceStandard(String name, int numCars, Car winner, ArrayList<Car> podium, ArrayList<Car> rCars,
			ArrayList<Garage> rGarages) {
		super(name, numCars, winner, podium, rCars, rGarages);
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	/****************** Metodos Propios *********************/

	/**
	 * Star race
	 * 
	 * @param coches
	 */

	public void startRace() {
		this.registerData();

		System.out.println("\n" + "░██████╗████████╗░█████╗░██████╗░████████╗\n"
				+ "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝\n" + "╚█████╗░░░░██║░░░███████║██████╔╝░░░██║░░░\n"
				+ "░╚═══██╗░░░██║░░░██╔══██║██╔══██╗░░░██║░░░\n" + "██████╔╝░░░██║░░░██║░░██║██║░░██║░░░██║░░░\n"
				+ "╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░\n" + "===========================================");

		System.out.println("===========================");

		Runnable runnable = new Runnable() {
			Car car = new Car();
			int laps = 0;
			int timmer = 0;

			public void run() {
				boolean finish = true;

				while (finish) {
					laps++;
					timmer += 10;

					if (timmer == 40) {
						finish = false;
					}

					for (int i = 0; i < numCars; i++) {

						for (int j = 0; j < Utils.garages.get(i).getCars().size(); j++) {

							try {
								// Inicio del hilo cada seg
								Thread.sleep(1000);

								// Movemos los coches
								car = Utils.garages.get(i).getCars().get(j);

								// Calcular distancia
								car.calculateDistance(timmer);
								
								
								// Velocidad
								car.acelerateCar();


								// Imprimir coche
								System.out.println(car);

								// Agregar al podium

							} catch (InterruptedException e) {
								e.printStackTrace();
							}

						}

					}
					if (finish == false) {

						System.out.println("===========================");
						System.out.println("======= Vuelta final ========");
						System.out.println("===========================");

					} else {
						System.out.println("===========================");
						System.out.println("======= Vuelta " + laps + " =========");
						System.out.println("===========================");
					}

				}

			}

		};

		Thread hilo = new Thread(runnable);
		hilo.start();
		System.out.println("Hilo Principal");

	}

}

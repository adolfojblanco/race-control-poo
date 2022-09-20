package racecontrol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RaceStandard extends Race {

	private int time;

	public RaceStandard() {

	}

	public RaceStandard(int time) {
		this.time = time;

	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		if (time == 0) {
			this.time = 3;
		} else {
			this.time = time;
		}
	}

	/****************** Metodos Propios *********************/

	public void raceCars() {

	}

	/**
	 * Star race
	 * 
	 * @param coches
	 */

	public void startRace() {
		this.registerData();

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la duración: ");
		int d = sc.nextInt();
		this.setTime(d);

		Runnable runnable = new Runnable() {
			int laps = 0;
			int timmer = 0;
			int dAux;

			public void run() {
				Car car = new Car();
				boolean finish = true;

				/** Usamos la lista de coches y seleccionamos los coches que van a correr **/
				for (int i = 0; i < numCars; i++) {
				car = car.carsList().get(i);
				rCars.add(car);
			}

				// Esto se ejecuta en segundo plano una única vez
				while (finish) {
					laps++;
					timmer++;

					int contador = 0;

					if (timmer == time) {
						finish = false;
					}

					try {
						Thread.sleep(1000);

						for (int i = 0; i < rCars.size(); i++) {
							// Seleccionamos el coche para moverlo.
							Car c = rCars.get(i);
							c.acelerateCar();
							c.calculateDistance(timmer);
							System.out.println(c);
						}

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					if (finish) {
						System.out.println("===========================");
						System.out.println("======= Vuelta " + laps + " =========");
						System.out.println("===========================");

					} else {
						System.out.println("===========================");
						System.out.println("===== Vuelta Final ========");
						System.out.println("===========================");
						
						rCars.stream().sorted((c2, c1) -> Integer.compare(c1.getDistance(), c2.getDistance())).limit(3)
						.forEachOrdered(x -> podium.add(x));
						
//						rCars.stream().limit(3).sorted((c2, c1) -> Integer.compare(c1.getDistance(), c2.getDistance())).limit(3)
//						.forEachOrdered(x -> podium.add(x));
						

						System.out.println("===========================");
						System.out.println("===== Ganadores ===========");
						System.out.println("===========================");
						int pos = 1;
						for (Car c : podium) {
							System.out.println(pos++ +" | " + c);
						}
					}
				}
			}
		};

		// Creamos un hilo y le pasamos el runnable
		Thread hilo = new Thread(runnable);
		hilo.start();

		// Y aquí podemos hacer cualquier cosa, en el hilo principal del programa
		Utils.printStart();
		System.out.println("Inicio de la carrera: " + this.getName());
		System.out.println("Participan: " + this.getNumCars() + " Coches");
		System.out.println("La carrera durara: " + this.getTime() + " hras.");
	}


}


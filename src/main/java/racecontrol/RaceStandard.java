package racecontrol;

import java.util.ArrayList;
import java.util.Scanner;

public class RaceStandard extends Race {

	private int time;

	public RaceStandard() {

	}

	public RaceStandard(int time) {
		this.time = time;

	}

	public RaceStandard(String name, int numCars, Car winner, ArrayList<Car> podium, ArrayList<Car> rCars,
			ArrayList<Garage> rGarages) {
		super(name, numCars, winner, podium, rCars, rGarages);
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

//	public void startRace() {
//
//		this.registerData();
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce la duración: ");
//		int d = sc.nextInt();
//		this.setTime(d);
//
//		Runnable runnable = new Runnable() {
//			int laps = 1;
//			int timmer = 0;
//
//			public void run() {
//				Car car = new Car();
//				RaceStandard rStandard = new RaceStandard();
//				boolean finish = true;
//				int contador = 0;
//
//				/** Usamos la lista de coches y seleccionamos los coches que van a correr **/
//				for (int i = 0; i < getNumCars(); i++) {
//					// Generamos un numero aleatorio, con el numero de coches totales que existen.
//					int numR = Utils.ramdomNuber(0, car.carsList().size());
//					car = car.carsList().get(numR);
//					rCars.add(car);
//				}
//
//				while (finish) {
//					laps++;
//					timmer++;
//
//					if (timmer == time) {
//						finish = false;
//					}
//
//					System.out.println("finish: " + finish);
//					System.out.println("time: " + time);
//					System.out.println("timer: " + timmer);
//
//					for (int j = 0; j < rStandard.getrCars().size(); j++) {
//
//						System.out.println(j);
//
//						try {
//							// Inicio del hilo cada seg
//							Thread.sleep(1000);
//							System.out.println("Comenzamos");
//							Car sCar = rStandard.getrCars().get(j);
//
//							// Calcular distancia
//							sCar.calculateDistance(timmer);
//
//							// Velocidad
//							car.acelerateCar();
//
//							// Imprimir coche
//							System.out.println(sCar);
//
//							// Agregar al podium
//
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//
//					}
//
//				}
//
//				if (finish) {
//					System.out.println("===========================");
//					System.out.println("======= Vuelta " + laps + " =========");
//					System.out.println("===========================");
//
//				} else {
//					System.out.println("===========================");
//					System.out.println("======= Vuelta final ========");
//					System.out.println("===========================");
//				}
//			}
//		};
//				
//				Thread hilo = new Thread(runnable);
//				hilo.start();
//				Utils.printStart();
//				System.out.println("Inicio de la carrera: " + this.getName());
//				System.out.println("Participan: " + this.getNumCars() + " Coches");
//				System.out.println("La carrera durara: " + this.getTime() + " hras.");
//			}

	public void startRace() {
		this.registerData();

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la duración: ");
		int d = sc.nextInt();
		this.setTime(d);

		Runnable runnable = new Runnable() {
			int laps = 0;
			int timmer = 0;

			public void run() {
				Car car = new Car();
				boolean finish = true;

				/** Usamos la lista de coches y seleccionamos los coches que van a correr **/
				
				for (int i = 0; i < getNumCars(); i++) {
					
					// Generamos un numero aleatorio, con el numero de coches totales que existen.
					int numR = Utils.ramdomNuber(0, car.carsList().size());
					car = car.carsList().get(numR);
					rCars.add(car);
				}

				// Esto se ejecuta en segundo plano una única vez
				while (finish) {
					laps++;
					timmer++;

					if (timmer == time) {
						finish = false;
					}

					try {
						Thread.sleep(1000);
						
						for (int i = 0; i < rCars.size(); i++) {
							Car c = rCars.get(i);
							c.acelerateCar();
							c.calculateDistance(timmer);
							System.out.println(c);
							
							
						}
						// Agregar al podium

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					if (finish) {
						System.out.println("===========================");
						System.out.println("======= Vuelta " + laps + " =========");
						System.out.println("===========================");

					} else {
						System.out.println("===========================");
						System.out.println("===== Vuelta final ========");
						System.out.println("===========================");
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


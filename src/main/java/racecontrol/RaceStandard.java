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
		}else {
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
			int laps = 1;
			int timmer = 1;

			public void run() {
				Car car = new Car();
				RaceStandard rStandard = new RaceStandard();
				boolean finish = true;
				int contador = 1;

				/** Usamos la lista de coches y seleccionamos los coches que van a correr **/
				for (int i = 0; i < getNumCars(); i++) {
					// Generamos un numero aleatorio, con el numero de coches totales que existen.
					int numR = Utils.ramdomNuber(0, car.carsList().size());
					car = car.carsList().get(numR);
					rCars.add(car);
				}
				

				while (finish) {
					laps++;

					if (timmer == time) {
						finish = false;
					}
					
					for (int i = 0; i < rStandard.getrCars().size(); i++) {
						
						System.out.println(rStandard.getrCars().size());

						try {
							// Inicio del hilo cada seg
							Thread.sleep(1000);
							System.out.println("Comenzamos");
							Car sCar = rStandard.getrCars().get(i);
							

							// Calcular distancia
							sCar.calculateDistance(timmer);

							// Velocidad
							car.acelerateCar();

							// Imprimir coche
							System.out.println(sCar);

							// Agregar al podium

						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}

				}
				contador = 1;
				
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
			

		};
		
		Thread hilo = new Thread(runnable);
		hilo.start();
		Utils.printStart();
		System.out.println("Inicio de la carrera: " + this.getName());
		System.out.println("Participan: " + this.getNumCars() + " Coches");
		System.out.println("La carrera durara: " + this.getTime() + " hras.");


		}
	}

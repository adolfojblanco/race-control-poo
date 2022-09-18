package racecontrol;

import java.util.ArrayList;
import java.util.Random;

public class Utils {
	
	
	/**
	 * Return a ramdom number
	 * 
	 * @param min
	 * @param max
	 * @return number
	 */
	static int ramdomNuber(int min, int max) {
		Random random = new Random();
		int value = random.nextInt(max + min) + min;
		return value;
	}
	
	/**
	 * Garage List
	 */
	static ArrayList<Garage> garages = new ArrayList<Garage>();
	
	
	public static void setTime(int h) {
		int time = 0;
		RaceStandard race = new RaceStandard();
		if (h == 0) {
			race.setTime(3);
		}else {
			race.setTime(h);
		}
	}
	
	/**
	 * Print Start
	 */
	public static void printStart() {
		System.out.println("\n" + "░██████╗████████╗░█████╗░██████╗░████████╗\n"
				+ "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝\n" + "╚█████╗░░░░██║░░░███████║██████╔╝░░░██║░░░\n"
				+ "░╚═══██╗░░░██║░░░██╔══██║██╔══██╗░░░██║░░░\n" + "██████╔╝░░░██║░░░██║░░██║██║░░██║░░░██║░░░\n"
				+ "╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░\n" + "===========================================");

		System.out.println("===========================");

	}

}

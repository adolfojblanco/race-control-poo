package racecontrol;

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

}

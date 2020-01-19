package hour3;

import java.util.*; 
//importing all packages from the utility class in java.  the * is used to import all

class Dice {

	public static void main(String[] args) {
			Random generator = new Random();
			int value = generator.nextInt();
			System.out.println("The random number is "
					+ value);

	}

}

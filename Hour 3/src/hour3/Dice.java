package hour3;

import java.util.*; 
//importing all packages from the utility package in java.  the * is used to import all
//no longer necessary to use the full name java.util.Random for the Random class

class Dice {

	public static void main(String[] args) {
			Random blah = new Random();
			//The Random class can be used to create Random objects.  used the 'new' keyword, followed by name of the class and parentheses
			//this creates a variable named 'generator' that holds a 'new' Random object.
			int value = blah.nextInt();
			//for this program the object's 'nextInt' method will be employed to produce a random integer value
			
			
			
			
			//there are far superior ways to actually get random numbers according to orcale's documentation
			System.out.println("The random number is "
					+ value);

	}

}

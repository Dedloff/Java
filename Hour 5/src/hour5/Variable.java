package hour5;

class Variable {

	public static void main(String[] args) {
		int tops;
		//statement creates a variable named 'tops' with no value 'int' means it's a type to store integer numbers
		float gradePointAverage;
		//Statement creates a variable wwith the name 'gradePointAverage' as a floating point variable (may contain a decemal) 
		//double can hold 300 figures, use it instead of float
		
		char key = 'C';
		//character values (char) require single qquotion marks on both sides of the character value
		
		
		String productName = "Bassnectar";
		//string values must use double quotes
		
		long salary = 240996060;
		long salary2 = 240_996_060;
		
		//Java can make long numbers readable with underscores such as above
		
		
		float pi = 3.14F;
		//You can append a letter to a numeric value to indicate the value's type. The 'F' indicates that it's a float value, if the letter was
		//omitted Java assumes that 3.14 is a double variable
		
		final int TOUCHDOWN = 6;
		//Capitalizing every letter in the names of variables assigns them as constants
		
		double weight = 205;
		weight = weight + 10;
		//+ operator set to the weight variable
		
		int power = 8;
		power++;
		//power++ Increments the value of a variable by one power++; adds one to the value stored in the power variable
		
		int nah = 9;
		nah --;
		//same example with -- decreases value
		
		int Lorin = 808;
		--Lorin;
		//you can also add the increment and decrement operators in front of the variable name
		
		
		
		
		int X = 3;
		int answer = X++ * 10;
		//Consider the following statement, what does X = ?
		//30 lol because of how this operator is postfixed.  
		//POSTFIXED OPERATORS USED ON A VARIABLE INSIDE AN EXPRESSION - VALUE DOES NOT CHANGE UNTIL AFTER THE FULL EXPRESSION IS EVALUTED
		System.out.println(answer);
		
		
		int y = 3;
		int answer2 = ++y * 10;
		System.out.println(answer2);
		//The following statement equals 40 , because the variable y is prefixed so Y was changed to 4 before the full expression, 4 * 10 = 40
		
		
		//the statement 
		//int value = Z++ * 10;
		//does the same exact thing as
		//int value = Z * 10;
		//Z++;
		
		//the statement
		//int value = ++Z * 10;
		//does the same exact thig as
		//int value = z * 10;
		//Z++
		//int value = Z * 10;
		
		int ecks = 5;
		int number = ecks++ * 6 + 4 * 10 / 2;
		//what does number = ?
		//50
		
		
		
		
		
		
		

	}

}

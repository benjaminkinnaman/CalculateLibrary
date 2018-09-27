//This class contains methods that perform various math operations
//@author Benjamin Kinnaman
//@version September 6 2018

public class Calculate {
	public static int square(int number) {   //Squares a value.
		int answer;
		answer = number*number;
		return answer;
}
	
	public static int cube(int number) {	//Cubes a value.
		int answer;
		answer = number * number * number;
		return answer;
	}
	
	public static double average(double number, double number2) {	//Averages 2 numbers.
		double answer;
		answer = ((number + number2)/2);
		return answer;
		
	}
	
	public static double average(double number, double number2, double number3) {	//Averages 3 numbers.
		double answer;
		answer = ((number +number2 +number3)/3);
		return answer;
	}
	
	public static double toDegrees(double radianValue ) {	//Converts an angle measure given in radians to degrees
		double answer;		
		answer = radianValue * (180/3.14159);
		return answer;
	}
	
	public static double toRadians(double degreeValue) {		//Converts an angle measure given in degrees to radians
		double answer;
		answer = degreeValue * (3.14159/180);
		return answer;
	}
	
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = ((b*b)-(4*(a*c)));
		return answer;	
	}
	
	public static String toImproperFrac(int wholeNumInit, int numerator, int denom) {  //Converts a mixed number into an improper fraction.
		String answer;
		answer = (((wholeNumInit * denom) + numerator) + "/" + denom );
		return answer;
	}
	
	public static String toMixedNum(int numerator, int denom) {		//Converts an improper fraction into a mixed number.
		String answer;
		answer = ((numerator / denom) + "_" + (numerator % denom) + "/" + denom);
		return answer;
	}

	public static String foil(int a, int b, int c, int d, String var)  {	//Converts a binomial multiplication of the form (ax+b)(cx+d) into a quad equation ax^2+bx+c
		String answer;
		answer = (a*c) + var + "^2 + " + ((a*d)+(b*c)) + "n + " + (b*d);
		return answer;
	}
	
	public static boolean isDivisbleBy(int divideMe, int iDivide) {
		boolean answer;
		if (divideMe % iDivide == 0) {
			answer = true;
		
}	else {
		answer = false;
}
		return answer;
	}
		
	
	public static double absValue(double notAbs) {							//Finds the absolute value of a number.
	double answer;															//Declares answer output.
	if (notAbs >= 0) {														//Checks if our input is more than or equal to zero; is it positive?
		answer = notAbs;														//If this is true, then it is the output.
	} else {				
		answer = notAbs + (notAbs * 2);											//If this is not true, and the number is negative, add the number times itself to itself.
	}
		return answer;
	}
	
	public static double max(double first, double second) {					//Finds the largest of two numbers.
		double answer;
		if (first > second) {
			answer = first;
		} else {
			answer = second;
		}
		
		return answer;
	}
	
	public static double max(double first, double second, double third) {	//Finds the largest of three numbers.
		double answer = 0;
		if (first > second && first > third) {
			answer = first;			
		} else if (second > first && second > third) {
			answer = second;
		} else if (third > first && third > second) {
			answer = third;
		}
			return answer;
	}
	
	public static int min(int first, int second) {
		int answer;
		if (first < second) {
			answer = first;
		} else {
			answer = second;
		}
		
		return answer;
	}
	
	public static double round2(double roundMe) {
		double expanded = roundMe * 100;
		int convert = (int) expanded;
		double recompressed = (double) convert / 100;
		double throwMeAway = recompressed + 0.005;
		if (roundMe>throwMeAway) {
			roundMe += 0.01;
		}
		double finalRecompress = roundMe*100;
		int prepareoutput = (int) finalRecompress;
		double answer = (double) prepareoutput / 100;
		return answer;
	}	 
	
	//Part 3
	
	public static double exponent(double number, int exponent) {
		double answer;
		double numDefault = number;
		if (exponent == 0) {
			answer = 1;
		} else {
			for (int loopcount = 1; loopcount < exponent; loopcount++) {
				number *= numDefault; 
			}
			answer = number;
		}
		
		return answer;
	}
	
	public static int factorial(int userVar) {
		int answer = userVar;
		for (int tickdown = userVar - 1; tickdown > 0; tickdown--) {
			answer *= tickdown;
		}
		return answer;
	}
	
	public static boolean isPrime(int userVar) {	//isPrime
		boolean primeStatus = true;
		for (int checkThisNumber = 2; checkThisNumber <= userVar; checkThisNumber++) {
			if (isDivisbleBy(userVar, checkThisNumber) && userVar != checkThisNumber) {
				primeStatus = false;
				return primeStatus;
			}	else if (userVar % checkThisNumber != 0){
				primeStatus = true;
			}
		}
			return primeStatus;
		
	}	//isPrime ends
	
/*	public static int gcf(int num1, int num2 ) {
		
	}*/
	
	} //Final bracket
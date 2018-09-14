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
	
//	public static String toImproperFrac(int wholeNumInit, int denom, int initNumerator) {  //Converts a mixed number into an improper fraction.
//		String answer;
//		answer = ((wholeNumInit * denom) +  );
//		return answer;
//	}
	
//	public static double toMixedNum() {		//Converts an improper fraction into a mixed number.
//		double answer;
//		answer = ();
//		return answer;
//	}

	public static String foil(int a, int b, int c, int d, String var)  {	//Converts a binomial multiplication of the form (ax+b)(cx+d) into a quad equation ax^2+bx+c
		String answer;
		answer = (a*c) + var + "^2 + " + ((a*d)+(b*c)) + "n + " + (b*d);
		return answer;
	}
	
}
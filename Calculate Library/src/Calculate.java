//This class contains methods that perform various math operations
//@author Benjamin Kinnaman
//@version September 6 2018

public class Calculate {
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer;
}
	
	public static int cube(int number) {
		int answer;
		answer = number * number * number;
		return answer;
	}
	
	public static double average(double number, double number2) {
		double answer;
		answer = ((number + number2)/2);
		return answer;
		
	}
	
	public static double average(double number, double number2, double number3) {	
		double answer;
		answer = ((number +number2 +number3)/3);
		return answer;
	}
	
	//public static double toDegrees( ) {
		
	//}
	
	//public static double toRadians {
		
	//}
	
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = ((b*b)-(4*(a*c)));
		return answer;
	
	}
	
//	public static

	

}

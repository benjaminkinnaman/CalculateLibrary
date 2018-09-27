//This class is client code that uses the Calculate Library to perform various mathematical tasks
//author Benjamin Kinnaman
//@version September 6 2018

public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(10, 100));
		System.out.println(Calculate.average(10,100,1000));
		System.out.println(Calculate.toDegrees(5));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(6, 7, 3));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisbleBy(8, 9));
		System.out.println(Calculate.absValue(-99));
		System.out.println(Calculate.max(9, 56));
		System.out.println(Calculate.max(8, 65, 25));
		System.out.println(Calculate.min(8, 56));
		System.out.println(Calculate.round2(56.65467));
		System.out.println(Calculate.exponent(5, 3));
		System.out.println(Calculate.factorial(6));
		System.out.println(Calculate.isPrime(9));
	
	
	}

}

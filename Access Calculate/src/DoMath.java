//This class is client code that uses the Calculate Library to perform various mathematical tasks
//author Benjamin Kinnaman
//@version September 6 2018

public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(10, 100));
		System.out.println(Calculate.average(10,100,1000));
		System.out.println(Calculate.discriminant(6, 7, 3));
	}

}

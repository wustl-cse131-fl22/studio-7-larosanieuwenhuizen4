package studio7;

public class Tester {

	public static void main(String[] args) {
		//Rect
		Rectangle rect1 = new Rectangle(3, 4);
		Rectangle rect2 = new Rectangle(2, 2);
		
		System.out.println(rect1.smallerThan(rect2));
		System.out.println(rect1.isSquare());
		System.out.println(rect2.isSquare());
		System.out.println(rect1.area());
		System.out.println(rect1.perimeter());
		
		//Die
		Die die1 = new Die(6);

		System.out.println(die1.roll());
		
		
		//Fraction
		Fraction frac1 = new Fraction(2, 3);
		Fraction frac2 = new Fraction(9, 4)

		System.out.println(frac1.);
		
		

	}

}

/*
 * File: RationalTest.java
 * -----------------------
 * Simple test of the Rational class.
 */

import acm.program.*;

public class RationalTest extends ConsoleProgram {

	public void run() {
		Rational a = new Rational(1, 2);
		Rational b = new Rational(1, 3);
		Rational c = new Rational(1, 6);
		Rational sum = a.add(b).add(c);
		println(a + " + " + b + " + " + c + " = " + sum);
		testDoubles();
	}

	public void testDoubles() {
		double a = 1.0 / 2.0;
		double b = 1.0 / 3.0;
		double c = 1.0 / 6.0;
		double sum = a + b + c;
		println(a + " + " + b + " + " + c + " = " + sum);
	}

}

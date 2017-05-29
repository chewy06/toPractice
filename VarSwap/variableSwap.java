import java.util.*;

class variableSwap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("[Addition and Subtraction]\nValues before swaping, a: " + a + " b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Values after swap, a: " + a + " b: " + b);

		System.out.println("[A XOR B]\nValues before swaping, a: " + a + " b: " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("Values after swap, a: " + a + " b: " + b);

		System.out.println("[Multiplication and Division]\nValues before swaping, a: " + a + " b: " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("Values after swap, a: " + a + " b: " + b);
	}
}

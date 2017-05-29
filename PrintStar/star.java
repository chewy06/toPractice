import java.util.*;

class star {
	public static void main(String[] args) {
		int number = new Scanner(System.in).nextInt();
		printStar(number, 1);
	}

	public static void printStar(int s, int n) {
		if (n>=s)
			stars(1,s);
		else {
			stars(1,n);
			printStar(s,n+2);
			stars(1,n);

		}

	}

	public static void stars(int variable, int condition) {
		for (int i = variable; i <= condition; i++)
			System.out.print("*");	
		System.out.println();
	}
}

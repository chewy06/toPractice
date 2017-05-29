import java.util.*;

class prime {

	public static boolean isPrime(int p) {
		for (int i=2; i<p/2;i++) {
			if (p%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int p = scan.nextInt();
		System.out.println(p +" is prime: " + isPrime(p));
	}
}

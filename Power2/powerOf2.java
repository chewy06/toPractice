import java.util.*;

class powerOf2 {
	public static void main(String[] args) {
		int p = new Scanner(System.in).nextInt();
		System.out.println("is Power of 2: " + isPower2(p));
	}

	public static boolean isPower2(int number) {return (number > 0) && (number & (number-1))==0;}
}

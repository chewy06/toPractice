import java.util.*;

class palindrome {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int palindrome = new Scanner(System.in).nextInt();

		if (isPalindrome(palindrome)) 
			System.out.println("Number: " + palindrome + " is Palindrome");
		else
			System.out.println("Number: " + palindrome + " is not Palindrome");

	}
	
	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
			System.out.println("Remainder: " + remainder + " Reverse: " + reverse + " Palindrome: " + palindrome);
		}
		
		if (number == reverse)
			return true;

		return false;

	}
}

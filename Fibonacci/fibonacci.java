import java.util.*;

class Compute {
	public Compute() {
	}

	public void FibonacciIteration(int fiboNumber) {
		for (int i=1; i <= fiboNumber; i++) {
			System.out.print(fibonacciComputation(i) + " ");
		}
		System.out.println();
	}

	public void Recursive(int fiboNumber) {
		for (int i=1; i <= fiboNumber; i++) {
			System.out.print(RecursiveFibonacci(i) + " ");
		}
		System.out.println();
	}


	private int fibonacciComputation(int number){
		if (number==1 || number==2)
			return 1;

		int fibo1=1, fibo2=1, fibonacci=1;

		for(int i=3; i<=number; i++){
			fibonacci=fibo1 + fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
		}
		return fibonacci;
	}

	public int RecursiveFibonacci(int number) {
		if (number==1 || number==2) {
			return 1;
		}

		return RecursiveFibonacci(number-1) + RecursiveFibonacci(number-2);
	} 
}

class fibonacci {
	public static void main(String[] args) {
		Compute f = new Compute();
		
		System.out.print("Fibonacci Iteration: ");
		f.FibonacciIteration(10);		
		System.out.print("Fibonacci Recursive: ");
		f.Recursive(10);
	}
}

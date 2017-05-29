import java.util.*;

class Solution {
	private int sum, len, arr[];
	public Solution(int[] arr) {
		this.sum = 0;
		this.arr = arr;
		this.len = arr.length;
	}

	public int hasSolution() {
		for (int s: arr)
			this.sum += s;

		if (sum-arr[len-1]==0)
			return len-1;

		if (sum-arr[0]==0)
			return 0;


		return hasValue();
	}

	private int hasValue(){
		int temp=0;
		for (int i=0;i<len-1; i++) {
			temp += arr[i];
			sum -= arr[i];
			System.out.println("temp: " + (temp+arr[i+1]) + " sum: " + sum);
			if (temp + arr[i+1] == this.sum)
				return i+1;
		}

		return -1;
	}
}

class sum {
	public static void main(String[] args) {
		int[] arr1 = {1,1,1,1,1};
		int[] arr2 = {-1,-1,-1,-1,-1};
		
		Solution s1 = new Solution(arr1);
		Solution s2 = new Solution(arr2);

		int sol1 = s1.hasSolution();
		int sol2 = s2.hasSolution();

		if(sol1!=-1)
			System.out.println("is idx: " + sol1);	
		else
			System.out.println("No solution");

		if(sol2!=-1)
			System.out.println("is idx: " + sol2);	
		else
			System.out.println("No solution");

	}
}

package Array_Functions;

import java.util.Scanner;

public class LargestFactorFuntion {
	public static int largestFactor(int num) {
		int large=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				large=i;
			}
		}
		return large;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Largest factor of given number: "+largestFactor(num));
		

	}

}

package Exercises;

import java.util.Scanner;

public class ReverseTheNUmber {
	static void rev(int num) {
		int rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse number of given number\n" + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		rev(num);
	}

}

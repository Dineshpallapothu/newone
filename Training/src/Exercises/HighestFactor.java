package Exercises;

import java.util.Scanner;

public class HighestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		int hf = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				hf = i;
			}
		}
		System.out.println(hf);
	}

}

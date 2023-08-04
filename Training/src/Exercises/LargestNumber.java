package Exercises;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int max = 0;
		System.out.println("Enter ten values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Largest element" + max);

	}

}

package Exercises;

import java.util.Scanner;

public class Interchnagetheelements {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int k = nums.length / 2;
		for (int j = 0; j < nums.length / 2; j++) {
			temp = nums[j];
			nums[j] = nums[k];
			nums[k] = temp;
			k++;
		}
		for (int g : nums) {
			System.out.print(g + " ");
		}

	}

}

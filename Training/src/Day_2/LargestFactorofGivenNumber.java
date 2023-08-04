package Day_2;

import java.util.Scanner;

public class LargestFactorofGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int largest_factor = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				largest_factor = i;
			}
		}
		System.out.println("Largest Factor :" + largest_factor);
	}

}

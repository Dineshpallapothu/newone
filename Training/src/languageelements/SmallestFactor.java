package languageelements;

import java.util.Scanner;

public class SmallestFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		int min = num;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if (min > i && num != i && i != 1) {
					min = i;
				}
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Factor " + num);
		} else {
			System.out.println("min Factor" + min);
		}

	}

}

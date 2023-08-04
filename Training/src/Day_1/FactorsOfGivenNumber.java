package Day_1;

import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		System.out.println("Factors of Given Number");
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}

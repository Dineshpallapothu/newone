package languageelements;

import java.util.Scanner;

public class SumofDIgits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First NUmber");
		int num = sc.nextInt();
		int sum = 0, rem;
		while (num > 0) {
			rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		System.out.println("sum of all digits "+sum);

	}

}

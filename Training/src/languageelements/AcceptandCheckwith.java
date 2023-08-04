package languageelements;

import java.util.Scanner;

public class AcceptandCheckwith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2 = sc.nextInt();
		if (num1 % 5 == 0 && num2 % 5 == 0) {
			System.out.println("num1 " + num1 + " num2 " + num2);
		} else {
			System.out.println("not divisible");
		}

	}
}

package languageelements;

import java.util.Scanner;

public class CheckNumberofDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		System.out.println("Enter the Month");
		int month = sc.nextInt();
		int a = switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;

		case 2 -> {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				yield 29;
			} else {
				yield 28;
			}
		}
		default -> 30;
		};
		System.out.println("Number of Days " + a);

	}

}

package Day_2;

import java.util.Scanner;

public class WagesOfaWeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of hours");
		int hours = sc.nextInt();
		System.out.println("Enter the day number");
		int day = sc.nextInt();

		int amount = switch (day) {
		case 1, 2, 3 -> 100;
		case 4, 5 -> 125;
		case 6 -> 150;
		case 7 -> 200;
		default -> 0;
		};

		amount = amount * hours;
		if (amount > 1000) {
			amount = (int) (amount + (amount * 0.1));
		}
		System.out.println("wage amount" + amount);

	}

}

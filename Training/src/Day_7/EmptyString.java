package Day_7;

import java.util.Scanner;
import java.util.StringJoiner;

public class EmptyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String longstr = "";
		while (true) {
			System.out.println("Enter the String :");
			String str = sc.nextLine();
			if (str.isEmpty()) {
				break;
			} else {
				int g = str.compareToIgnoreCase(longstr);
				if (g > 0) {
					longstr = str;
				}
			}

		}
		System.out.println("Longest String " + longstr);

	}

}

package Day_6;

import java.util.Scanner;

public class CuntTheuppercaseand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		int uppercount = 0;
		int lowercount = 0;
		int digits = 0;
		int special = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				uppercount++;
			} else if (Character.isLowerCase(str.charAt(i))) {
				lowercount++;
			} else if (Character.isDigit(str.charAt(i))) {
				digits++;
			} else {
				special++;
			}
		}
		System.out.println("Upper Case count: " + uppercount);
		System.out.println("Lower Case count: " + lowercount);
		System.out.println("Digits Count: " + digits);
		// System.out.println(special);
	}

}

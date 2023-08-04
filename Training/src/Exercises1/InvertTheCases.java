package Exercises1;

import java.util.Scanner;

public class InvertTheCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str1 = new StringBuffer();
		String str = sc.nextLine();

	 	for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			} else if (Character.isLowerCase(str.charAt(i))) {
				c = Character.toUpperCase(c);

			}
			str1.append(c);
		}
		System.out.println("Before Inverted: " + str);
		System.out.println("After Inverted: " + str1);

	}

}

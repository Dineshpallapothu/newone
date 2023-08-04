package Exercises1;

import java.util.Scanner;

public class EndProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.nextLine());
		for (int i = 0; i < sb.length(); i++) {
			String str = sc.nextLine();
			if (str.equals("END")) {

				break;
			}
			sb.append('-');
			sb.append(str);
		}

		System.out.println(sb);

	}

}

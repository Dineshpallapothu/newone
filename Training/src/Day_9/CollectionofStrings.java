package Day_9;

import java.util.Arrays;
import java.util.Scanner;

public class CollectionofStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[10];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		Arrays.sort(str, (a, b) -> a.length() - b.length());
		for (String s : str) {
			System.out.print(s + " ");
		}

	}

}

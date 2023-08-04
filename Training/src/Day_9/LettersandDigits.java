package Day_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LettersandDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] string = new String[5];
		for (int i = 0; i < string.length; i++) {
			string[i] = sc.nextLine();
		}
		Arrays.sort(string, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.parseInt(s1.substring(2)) - Integer.parseInt(s2.substring(2));
			}
		});
		for(String s:string) {
			System.out.println(s);
		}
	}

}

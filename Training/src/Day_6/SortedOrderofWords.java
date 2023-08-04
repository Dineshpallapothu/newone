package Day_6;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOrderofWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the long string: ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		Arrays.sort(words);
		for (String sr : words) {
			System.out.print(sr + " ");
		}
	}

}

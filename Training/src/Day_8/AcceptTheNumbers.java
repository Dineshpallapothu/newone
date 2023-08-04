package Day_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AcceptTheNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int sum = 0;
		while (true) {
			try {
				int g = Integer.parseInt(sc.next());
				
				sum += g;
				if (g == 0) {
					break;
				}
				c++;
			} catch ( NumberFormatException e) {
				System.out.println("Enter the number please");
			}

		}
		System.out.println("Avg" + (sum / c));

	}

}

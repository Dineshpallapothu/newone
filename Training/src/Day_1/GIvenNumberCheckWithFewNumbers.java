package Day_1;

import java.util.Scanner;

public class GIvenNumberCheckWithFewNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(1);
		} else if (num % 3 == 0) {
			System.out.println(2);
		} else if (num % 5 == 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

	}

}

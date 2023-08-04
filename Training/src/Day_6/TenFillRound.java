package Day_6;

import java.util.Scanner;

public class TenFillRound {

	public static void main(String[] args) {
		int arr[] = new int[10];
		// Scanner sc=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 100);
		}
		for (int e : arr) {
			if (e < 50)
				System.out.print(e + " ");
		}
		for (int y : arr) {
			if (y >= 50) {
				System.out.print(y + " ");
			}
		}

	}

}

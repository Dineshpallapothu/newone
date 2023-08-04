package Day_2;

import java.util.Scanner;

public class FindtheLargerthanavg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int total = 0;
		for (int n : arr) {
			total += n;
		}
		double avg = total / arr.length;

		System.out.println("These values are largerthan avg");
		for (int h : arr) {
			if (h > avg) {
				System.out.println(h);
			}
		}
	}

}

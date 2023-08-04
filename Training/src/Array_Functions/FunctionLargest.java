package Array_Functions;

import java.util.Scanner;

public class FunctionLargest {
	public static void large(int max, int... arr) {
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max Values " + max);
	}

	public static void main(String[] args) {
		
		large(0, 1, 23, 34, 54, 66, 12, 44, 33);

	}

}

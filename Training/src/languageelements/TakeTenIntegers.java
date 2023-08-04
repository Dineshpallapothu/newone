package languageelements;

import java.util.Scanner;

public class TakeTenIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 values");
		int arr[]=new int[10];
		int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}

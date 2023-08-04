package Array_Functions;

import java.util.Scanner;

public class AvarageOfPositive {
	public static int avg(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return(sum/a.length);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("avg of "+avg(arr));
	}

}

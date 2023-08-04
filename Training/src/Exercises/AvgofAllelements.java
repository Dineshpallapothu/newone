
package Exercises;

import java.util.Scanner;

public class AvgofAllelements {
	static void avg(int a[]) {
		double avg,sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		avg=sum/a.length;
		System.out.println("Avarage :"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 values");
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		avg(a);
		
	}

}

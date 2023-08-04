package Exercises1;

import java.util.Scanner;

public class EachWordinseperateline {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=sc.nextLine();
		String []words=str.split(" ");
		for(String s:words) {
			System.out.println(s);
		}
		
	}

}

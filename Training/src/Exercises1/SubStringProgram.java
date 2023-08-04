package Exercises1;

import java.util.Scanner;

public class SubStringProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		System.out.println("Enter the substring");
		String str1 = sc.next();
		
		
		for (int i = 0; i <str.length(); i++) {
			for(int j=0;j<str1.length();j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					System.out.print(i+" ");
				}
				
			}
		}

	}

}

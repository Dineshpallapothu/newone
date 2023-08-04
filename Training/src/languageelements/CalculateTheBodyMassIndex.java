package languageelements;

import java.util.Scanner;

public class CalculateTheBodyMassIndex {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight");
		double kg=sc.nextInt();
		System.out.println("Enter the height in cm");
		double cm=sc.nextInt();
		double BMI=(kg/cm/cm)*10000;
		System.out.println("Body mass Index"+BMI);
	}
}

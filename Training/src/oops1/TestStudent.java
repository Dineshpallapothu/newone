package oops1;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Admin no");
		int num = sc.nextInt();
		System.out.println("enter the course number");
		System.out.println("1 java");
		System.out.println("2 python");
		int course = sc.nextInt();
		System.out.println("Enter fee amount");
		double fee = sc.nextDouble();
		Student std = new Student(num, fee, course);
		if (course==1) {
			std.setCoursefee(12000);
		}
		else {
			std.setCoursefee(10000);
		}
		
		System.out.println("course name: " + std.getCourseName());
		System.out.println("Due AMount: " + std.getdue());
		System.out.println("Total Fee: " + std.getTotalfee());

	}
}

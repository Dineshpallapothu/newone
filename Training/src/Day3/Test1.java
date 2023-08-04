package Day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Square sq = new Square();
		System.out.println(sq.getArea(num));
		System.out.println(sq.getCircumference(num));
		System.out.println(sq.getSide(num));
	}

}

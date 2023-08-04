package Day3;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("please enter the values ");
		Square[] sq = new Square[5];

		for (int i = 0; i < sq.length; i++) {
			num = scanner.nextInt();
			sq[i] = new Square(num);
			System.out.println(sq[i].getArea(num));
		}

	}

}

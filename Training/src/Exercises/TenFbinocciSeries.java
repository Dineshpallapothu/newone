package Exercises;

public class TenFbinocciSeries {

	public static void main(String[] args) {
		int num = 0;
		int num1 = -1;
		int num2 = 1;
		int count = 1;
		while (count <= 10) {
			num = num1 + num2;
			num1 = num2;
			num2 = num;
			System.out.print(num + " ");
			count++;
		}

	}

}

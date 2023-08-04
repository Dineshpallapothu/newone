package Exercises;

public class Exponent {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int res = (int) Math.pow(a, b);
		System.out.println(res);
	}

}

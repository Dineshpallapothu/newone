package Exercises;

public class PalindromeFromThousandtotwothousand {

	public static void main(String[] args) {
		int rem, rev;
		for (int i = 1000; i <= 2000; i++) {
			int num = i;
			rev = 0;
			while (num > 0) {
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			if (rev == i) {
				System.out.println(i);
			}

		}
	}

}

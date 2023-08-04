package Day_2;

public class PrintMassageFollowedbyNames {
	static void wish(String msg, String... names) {
		for (String n : names) {
			System.out.println(msg + " " + n);
		}
	}

	public static void main(String[] args) {

		wish("hello", "dinesh", "arun", "prasanna", "praveen", "gunisetti");
	}

}

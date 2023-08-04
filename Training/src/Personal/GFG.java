package Personal;

public class GFG {

	public static void main(String[] args) {
		try {

			Process process = Runtime.getRuntime().exec("Terminal");
			System.out.println("Google Chrome successfully started");
		}

		catch (Exception e) {

			// e.printStackTrace();
			System.out.println("something is going on");
		}
	}
}
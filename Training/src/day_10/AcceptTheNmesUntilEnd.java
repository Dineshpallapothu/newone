package day_10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AcceptTheNmesUntilEnd {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		var fr = new FileWriter("home\\pdinesh\\Documents\\Student.text");
		while (true) {

			String str = sc.nextLine();
			if (str.equals("END")) {
				break;
			}
			fr.write(str.toUpperCase() + "\n");
		}
		sc.close();
		fr.close();

		
		

	}

}

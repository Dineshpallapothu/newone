package day_10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class AcceptFileandDisplayEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The File Name");
		String file_name = sc.nextLine();
		try {
			var fr = new FileReader("home\\pdinesh\\Documents\\" + file_name);
			var bfr = new LineNumberReader(fr);
			while (true) {
				String str_line = bfr.readLine();
				if (str_line == null) {
					break;
				}
				String[] str = str_line.split(" ");
				for (String s : str) {
					System.out.println(bfr.getLineNumber() + " " + s);
				}

			}

		}
		catch (IOException ee) {

		}

	}

}

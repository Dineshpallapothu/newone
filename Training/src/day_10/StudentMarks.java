package day_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		try {
			var fr = new FileReader("home\\pdinesh\\Documents\\Student.text");
			var br = new BufferedReader(fr);
			while (true) {
				var line = br.readLine();
				if (line == null) {
					break;
				}
				String[] n = line.split(",");
				String name = n[0];
				for (int i = 1; i < n.length; i++) {
					int mark = Integer.parseInt(n[i]);
					sum = sum + mark;
				}
				System.out.println(name + "-" + sum);
				sum = 0;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry file not found");
		} catch (NumberFormatException e) {

		}
	}
}

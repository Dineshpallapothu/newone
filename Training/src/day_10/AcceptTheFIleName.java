package day_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AcceptTheFIleName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File Name please");
		String file_name = sc.nextLine();
		try {
			var fr = new FileReader("home\\pdinesh\\Documents\\" + file_name);
			var br = new BufferedReader(fr);
			while (true) {
				String strline = br.readLine();
				if (strline == null) {
					break;
				} else if (strline.length() > 10) {
					System.out.println(strline);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry File Not Found Exception");
		} catch (IOException e) {

		}

	}

}

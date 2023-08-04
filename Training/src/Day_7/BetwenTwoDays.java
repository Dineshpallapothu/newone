package Day_7;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BetwenTwoDays {

	public static void main(String[] args) {
		System.out.println("Enter the date in dd-MM-YYYY");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		LocalDate date1 = LocalDate.parse(str1, dtf);
		LocalDate date2 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("dd-MM-uuuu"));

		long days = ChronoUnit.DAYS.between(date1, date2);
		System.out.println("Numbe of days between those two dates " + days);

	}

}

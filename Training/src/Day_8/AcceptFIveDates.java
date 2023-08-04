package Day_8;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class AcceptFIveDates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalDate[] date = new LocalDate[5];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-uuuu");

		int i = 0;
		while (i < date.length) {
			try {
				String str = sc.next();
				date[i] = LocalDate.parse(str, dtf);
				i++;
			} catch (DateTimeException e) {

			}
		}

		Arrays.sort(date);
		for (LocalDate d : date) {
			System.out.println(d.format(dtf));
		}

	}
}
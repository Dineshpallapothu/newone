package Day_7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class AcceptFIveDates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System	.in);
		LocalDate[] date = new LocalDate[5];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		for (int i = 0; i < date.length; i++) {
			
			String str = sc.next();
			date[i] = LocalDate.parse(str, dtf);
			
			
		}
		
		Arrays.sort(date);
		for (LocalDate d : date) {
			System.out.println(d.format(dtf));
		}

	}
}
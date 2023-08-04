package Exercises1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DIsplayItsortedOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = new String[10];
		for(int i=0;i<words.length;i++) {
			words[i]=sc.nextLine();
		}
		Arrays.sort(words);
		for(String s:words) {
			System.out.print(s+" ");
		}
		Collections.sort(null);
	}

}

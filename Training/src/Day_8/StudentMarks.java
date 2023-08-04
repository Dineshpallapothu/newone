package Day_8;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks separate with , ");
		String str=sc.nextLine();
		String []marks=str.split(",");
		int sum=0;
		int count=0;
		for(int i=0;i<marks.length;i++) {
			try {
				int mark=Integer.parseInt(marks[i]);
				sum+=mark;
				count++;
			}
			catch(NumberFormatException e) {
				
			}
			
		}
		System.out.println("Avg: "+(sum/count));
	}

}

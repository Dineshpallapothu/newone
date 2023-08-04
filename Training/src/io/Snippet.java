package io;

import java.io.FileInputStream;

public class Snippet {

	public static void main(String args[]) {
		try {
			FileInputStream fileInputStream = new FileInputStream("files.txt");
			int data = fileInputStream.read();
			while (data != -1) {
				// Process the data
				System.out.print((char) data);
				data = fileInputStream.read();
			}
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

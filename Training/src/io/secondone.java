package io;

import java.io.FileOutputStream;

public class secondone {
	public static void main(String args[]) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("files.txt");
			String data = "Hello, World!";
			byte[] byteData = data.getBytes();
			fileOutputStream.write(byteData);
			fileOutputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

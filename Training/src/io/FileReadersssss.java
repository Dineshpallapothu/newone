package io;

import java.io.FileReader;

public class FileReadersssss {

	public static void main(String[] args) {
		try {
		FileReader fileReader = new FileReader("file.txt");
		int data = fileReader.read();
		while (data != -1) {
		    // Process the data
		    System.out.print((char) data);
		    data = fileReader.read();
		}
		fileReader.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

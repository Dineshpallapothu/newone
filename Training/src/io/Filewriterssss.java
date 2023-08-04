package io;

import java.io.FileWriter;

public class Filewriterssss {

	public static void main(String[] args) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("file.txt");
		
		String data = "dinesh, pallapothu";
		fileWriter.write(data);
		fileWriter.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	
	}
}


package iostreamspractice;

import java.io.File;

public class TestFile {

	public static void main(String[] args) { 
           var t = new File("newnames.txt");
           System.out.println(t.exists());
           System.out.println(t.isFile());
	}

}
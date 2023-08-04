package iostreamspractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class UnionNames {

	public static void main(String[] args) throws IOException {
		var lines1 = Files.readAllLines(Path.of("home\\pdinesh\\documents\\names.txt"));
		var lines2 = Files.readAllLines(Path.of("newnames.txt"));
		System.out.println("hai");
		var names = new TreeSet<String>(lines1);
		names.addAll(lines2);

		for (var s : names)
			System.out.println(s);

	}

}
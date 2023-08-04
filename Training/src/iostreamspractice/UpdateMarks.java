package iostreamspractice;

import java.io.RandomAccessFile;

public class UpdateMarks {

	public static void main(String[] args) throws Exception {
		try (var raf = new RandomAccessFile("marksu.dat", "rw")) {
		   int rollno = 10;
		   int pos = (rollno - 1) * 4;
		   raf.seek(pos);
		   System.out.println(raf.readInt());
		   int marks = 55;
		   raf.seek(pos);
		   raf.writeInt(marks);
		   System.out.println(raf.readInt());
		}
	}

}
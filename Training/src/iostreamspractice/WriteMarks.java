package iostreamspractice;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		try (var raf = new RandomAccessFile("marksu.dat", "rw")) {
			for (int i = 1; i <= 20; i++) {
				raf.writeInt((int) Math.round(Math.random() * 99));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
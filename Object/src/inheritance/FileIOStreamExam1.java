package inheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStreamExam1 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("c:/test.bin");
			out = new FileOutputStream("c:/copy_test.bin");
			int bData = 0;
			while (true) {
				bData = in.read();
				if (bData == -1) {
					break;
				}
				out.write(bData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
package inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileRWExam1 {
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("c:/test.bin");
			writer = new FileWriter("c:/copy_test.bin");
			int bData = 0;
			while ((bData = reader.read()) > -1) {
				writer.write(bData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
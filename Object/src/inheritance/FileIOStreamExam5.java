package inheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExam5 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/text2.txt");
			String text = "동해물과 백두산이 마르고 닳도록\n" + "하느님이 보우하사 우리나라 만세";
			fos.write(text.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/* fos close */
		}
	}
}
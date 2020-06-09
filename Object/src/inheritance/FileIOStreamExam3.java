package inheritance;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStreamExam3 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			in = new FileInputStream("c:/test.bin");
			out = new FileOutputStream("c:/copy_test.bin");
			bis = new BufferedInputStream(in);
			bos = new BufferedOutputStream(out);
			int bData = 0;
			while ((bData = bis.read()) > -1) {
				bos.write(bData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			/* bos close */
			/* in close */
			/* out close */
		}
	}
}
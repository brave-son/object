package inheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class fileCopy {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("C:/Windows/System32/drivers/etc/hosts");
			OutputStream out = new FileOutputStream("C:/dev/hosts2");

			byte[] buffer = new byte[1024];
			while (true) {
				int data = in.read(buffer);
				if (data == -1)
					break;
				out.write(buffer);

			}
			System.out.println("완료되었습니다.");
			in.close();
			out.close();
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

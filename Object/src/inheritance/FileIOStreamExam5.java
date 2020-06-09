package inheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExam5 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/text2.txt");
			String text = "���ع��� ��λ��� ������ �⵵��\n" + "�ϴ����� �����ϻ� �츮���� ����";
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
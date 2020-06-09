package inheritance;

import java.io.FileWriter;
import java.io.IOException;

public class FileRWExam2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/text.txt");
			String text = "���� ���� ���Ƽ� �޿� ���� ������\n" + "�¼����� ��� �Ͼ� ������ ������ �޼ӿ�~";
			fw.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
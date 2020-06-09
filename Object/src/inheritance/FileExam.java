package inheritance;

import java.io.File;
import java.io.IOException;

public class FileExam {
	public static void main(String[] args) {
// ���� Ȯ��
		File file = new File("c:/test.bin");
		System.out.println(file.isFile());
// ���� ����
		File file2 = new File("c:/test2.bin");
		try {
			boolean isSuccess = file2.createNewFile();
			System.out.println("��� : " + isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		} // ���丮 ����
		File dir1 = new File("c:/temp");
		if (!dir1.isDirectory()) {
			boolean isSuccess = dir1.mkdir();
			System.out.println("��� : " + isSuccess);
		}
// ���� ���丮 ����
		File dir2 = new File("c:/test/test");
		if (!dir2.isDirectory()) {
			boolean isSuccess = dir2.mkdirs();
			System.out.println("��� : " + isSuccess);
		}
// ���� �̵�
		file.renameTo(new File("c:/temp/test.bin"));
	}
}
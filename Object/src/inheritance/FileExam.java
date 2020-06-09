package inheritance;

import java.io.File;
import java.io.IOException;

public class FileExam {
	public static void main(String[] args) {
// 파일 확인
		File file = new File("c:/test.bin");
		System.out.println(file.isFile());
// 파일 생성
		File file2 = new File("c:/test2.bin");
		try {
			boolean isSuccess = file2.createNewFile();
			System.out.println("결과 : " + isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		} // 디렉토리 생성
		File dir1 = new File("c:/temp");
		if (!dir1.isDirectory()) {
			boolean isSuccess = dir1.mkdir();
			System.out.println("결과 : " + isSuccess);
		}
// 하위 디렉토리 생성
		File dir2 = new File("c:/test/test");
		if (!dir2.isDirectory()) {
			boolean isSuccess = dir2.mkdirs();
			System.out.println("결과 : " + isSuccess);
		}
// 파일 이동
		file.renameTo(new File("c:/temp/test.bin"));
	}
}
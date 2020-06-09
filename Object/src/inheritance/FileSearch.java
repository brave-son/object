package inheritance;

import java.io.File;

public class FileSearch {
	public static void main(String[] args) {
		FileSearch fs = new FileSearch();
		fs.subDirList("c:/Windows");
	}

	public void subDirList(String source) {
		File dir = new File(source);
		File[] fileList = dir.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			File file = fileList[i];
			if (file.isFile()) {
				System.out.println("\t ���� �̸� = " + file.getName());
			} else if (file.isDirectory()) {
				System.out.println("���丮 �̸� = " + file.getName());
				subDirList(file.getAbsolutePath());
			}
		}
	}
}
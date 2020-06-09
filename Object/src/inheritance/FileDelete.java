package inheritance;

import java.io.File;

public class FileDelete {
	public static void main(String[] args) {
		FileDelete dd = new FileDelete();
		dd.deleteDirectory("c:/test");
	}

	public boolean deleteDirectory(String path) {
		File file = new File(path);
		if (!file.exists()) {
			return false;
		}
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				deleteDirectory(f.getAbsolutePath());
			} else {
				f.delete();
			}
		}
		return file.delete();
	}
}
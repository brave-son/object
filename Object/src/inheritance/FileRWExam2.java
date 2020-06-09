package inheritance;

import java.io.FileWriter;
import java.io.IOException;

public class FileRWExam2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/text.txt");
			String text = "³ª´Â ´«ÀÌ ÁÁ¾Æ¼­ ²Þ¿¡ ´«ÀÌ ¿À³ªºÁ\n" + "¿Â¼¼»óÀÌ ¸ðµÎ ÇÏ¾á ³ª¶ó¿´Áö ¾îÁ¬¹ã ²Þ¼Ó¿¡~";
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
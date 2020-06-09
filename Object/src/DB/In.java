package DB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class In {
	public static void main(String[] args) {
		InputStream in;
		try {
			in = new FileInputStream("c:/dev/out.txt");
			while (true) {
				int data =in.read();
				if (data == -1) 
					break;
					System.out.println(data);
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
			}
			
			
		}

}

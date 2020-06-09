package Email;

import java.io.BufferedReader;
import java.io.IOException;

public class listenThread implements Runnable {
	BufferedReader reader;

//***
	public listenThread(BufferedReader reader) {
		this.reader = reader;// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while (true) {
			String data;
			try {
				data = reader.readLine();
				System.out.println(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

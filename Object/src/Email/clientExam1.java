package Email;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class clientExam1 {

	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket("192.168.0.63", 8282);
		System.out.println("서버접속");
		OutputStream out = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);

		InputStream in = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(isr);

		listenThread lt = new listenThread(reader);
		new Thread(lt).start();

		Scanner sc = new Scanner(System.in);

		while (true) {
			writer.write(sc.next() + "\n");

			writer.flush();
			String data = reader.readLine();
			System.out.println(data);

		}

	}
}

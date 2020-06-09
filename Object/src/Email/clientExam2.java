package Email;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class clientExam2 {

	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket("192.168.0.52", 8282);
		System.out.println("서버접속");
		OutputStream out = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);

		InputStream in = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);

		while (true) {
			writer.write(sc.next() + "\n");

			writer.flush();
			String data = reader.readLine();
			System.out.println(data);

		}

	}
}

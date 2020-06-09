package Email;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam2 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("접속대기중");
		Socket s = ss.accept();
		System.out.println("클라이언트 접속");
		InputStream in = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(isr);

		OutputStream out = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);

		while (true) {
			String data = reader.readLine();
			System.out.println(data);
			writer.write("server => " + data + "\n");
			writer.flush();
		}

//		ServerSocket sSocket = new ServerSocket(20000);
//		Socket socket = sSocket.accept();
//		InputStream in = socket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(in, "euc-kr");
//		BufferedReader reader = new BufferedReader(isr);
//		String data = reader.readLine();
//		System.out.println(data);
	}
}
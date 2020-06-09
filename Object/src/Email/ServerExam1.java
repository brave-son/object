package Email;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader reader = null;
		listenThread lt = null;
		OutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter writer = null;
		Scanner sc = null;
		try {
			ss = new ServerSocket(8282);
			System.out.println("접속대기중");
			s = ss.accept();
			System.out.println("클라이언트 접속");
			in = s.getInputStream();
			isr = new InputStreamReader(in);
			reader = new BufferedReader(isr);
			lt = new listenThread(reader);
			new Thread(lt).start();

			out = s.getOutputStream();
			osw = new OutputStreamWriter(out);
			writer = new BufferedWriter(osw);
			sc = new Scanner(System.in);

			while (true) {

				writer.write("server => " + sc.next() + "\n");
				writer.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// reader의 주소를 ListenThread 로 옮겨줌

//		ServerSocket sSocket = new ServerSocket(20000);
//		Socket socket = sSocket.accept();
//		InputStream in = socket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(in, "euc-kr");
//		BufferedReader reader = new BufferedReader(isr);
//		String data = reader.readLine();
//		System.out.println(data);
	}
}
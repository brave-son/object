package Email;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Http1 {
	public static void main(String[] args) {
		URL url = null;
		URLConnection urlConnection = null;
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader reader = null;

		try {
			url = new URL("\"http://ggoreb.com/http/list2.jsp");
			urlConnection = url.openConnection();
			in = urlConnection.getInputStream();
			isr = new InputStreamReader(in, "utf-8");
			reader = new BufferedReader(isr);
			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				System.out.println(data);
				reader.close();
				isr.close();
				in.close();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 서버로 부터 받은 데이터를 문자로 변화하여 확인
		// 변환 보조 스트림

		// 한줄씩 가져오기

	}

//		InputStreamReader isr = new InputStreamReader(in, "utf-8");
//		BufferedReader reader = new BufferedReader(isr);
//		StringBuffer response = new StringBuffer();
//		String data = null;
//		while (true) {
//			data = reader.readLine();
//			if (data == null)
//				break;
//			response.append(data + "\n");
//		}
//		reader.close();
//		isr.close();
//		in.close();
//		System.out.println(response);
}

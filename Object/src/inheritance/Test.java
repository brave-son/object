package inheritance;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;

public class Test {
public static void main(String[] args) {
	// 라이브럴 사용 중 예외가  발생하는 경우가 존재함
	// try -catch 선택 
	
	try {
		Jsoup.connect("http://GGoreb.com").get();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	File f = new File("c:/dev/erroe.txt");
	
	try {
		f.createNewFile();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	Scanner s = new Scanner(System.in);
	try {
		System.out.println("숫자를 입력해주세요");
		s.nextInt();
		
	} catch (Exception e) {
		System.out.println("다시 시도 해주세요");
		// TODO: handle exception
	}
}
}

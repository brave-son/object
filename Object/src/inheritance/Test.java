package inheritance;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;

public class Test {
public static void main(String[] args) {
	// ���̺귲 ��� �� ���ܰ�  �߻��ϴ� ��찡 ������
	// try -catch ���� 
	
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
		System.out.println("���ڸ� �Է����ּ���");
		s.nextInt();
		
	} catch (Exception e) {
		System.out.println("�ٽ� �õ� ���ּ���");
		// TODO: handle exception
	}
}
}

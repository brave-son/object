package inheritance;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¼ýÀÚ¸¦ ÀÔ·Â=>");
		int n = sc.nextInt();
		String str = "";

		for (int i = 1; i < n + 1; i++) {
			str += i;
		}
		int count = 0;
		int idx = 0;
		while (true) {
			idx = str.indexOf("8", idx);
			if (idx == -1) 
				break;
				count++;
				idx++;
			
		}
		System.out.println("ÃÑ °¹¼ö´Â : " + count);

	}
}

//	public static void scanEight(int num) {
//		if (num % 10 == 8) {
//			count++;
//
//		} else if (num > 10) {
//			scanEight(num / 10);
//
//		} else {
//
//		}
//		{
//
//		}
//
//	}

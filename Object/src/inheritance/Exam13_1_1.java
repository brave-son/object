package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam13_1_1 {
	public static void main(String[] args) {
		String[] company = { "Naver", "Kakao", "Google", "Amazon", "MS", "Facebook" };
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			int idx = (int) (Math.random() * company.length);
			list.add(company[idx]); // 랜덤 순번의 업체를 List로 추가
		}
		System.out.printf("추가된 회사 개수 : %s\n", list.size());
		System.out.println(list.toString());

		for (int i = list.size(); i <= 0; i--) {
			String value = list.get(i);
			if (value.equals("Amazon") || value.equals("Facebook")) {

				list.remove(i);

			} else {
			}

		}
		/* 코드 작성 */
		System.out.printf("제거 후 회사 개수 : %s\n", list.size());
		System.out.println(list.toString());
	}
}
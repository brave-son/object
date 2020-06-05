package inheritance;

import java.util.ArrayList;

public class Exam13_1_2 {
	public static void main(String[] args) {
		String[] company = { "Naver", "Kakao", "Google", "Amazon", "MS", "Facebook" };
		ArrayList<String> list = new ArrayList<String>();
		
		while (true) {
			int num = (int) (Math.random()*4);
			
			if (!list.contains(company[num])) {
				list.add(company[num]);
			}if (list.size() == 4) {break;
				
			}
			
		}
		

		

		/* 코드 작성 */
		System.out.println(list.toString());
	}
}
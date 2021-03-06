package snippet;

import java.util.Scanner;

public class Exam06_5_BloodHouse {
	public boolean isPossible(Exam06_5_Human human) {
		int age = 0; // 헌혈자의 나이를 확인하여 저장

		boolean isPossible = false;
		age = human.getAge();
		if (age > 15 && age < 70) {
			isPossible = true;

		} else {

		}

		// 헌혈 가능 여부
		/* 넘겨받은 Human 클래스로부터 age 정보 확인 age = ? */
		/* age가 16세 이상 69세 이하 일때만 헌혈 가능하도록 조건문 작성 */
		return isPossible;
	}

	public String action(Exam06_5_Human human) {
		boolean res = isPossible(human);
		if (res) {
			String result = "헌혈이 완료되었습니다. XX님 감사합니다.";

		} else {
			String result = "헌혈이 불가능합니다.";
		}
		String result = ""; // 헌혈 결과 저장
		/* isPossible() 메소드를 활용하여 헌혈 가능 여부를 확인하는 조건문 작성 */
		/* 헌혈 가능 시 result = "헌혈이 완료되었습니다. XX님 감사합니다. */
		
		return result;
	}
}
package snippet;

import java.util.Scanner;

public class Exam06_5_Main {
	public static void main(String[] args) {
		/* 헌혈자 정보 */
		Exam06_5_Human human = new Exam06_5_Human();
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		String type = sc1.nextLine();
		int age = sc1.nextInt();

		human.setName(name);
		human.setType(type);
		human.setAge(age);

		/* BloodHouse 객체 생성 */
		Exam06_5_BloodHouse bloodhouse = new Exam06_5_BloodHouse();

		String result = bloodhouse.action(human); // action() 메소드 호출 결과 저장
		/* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
		/* action() 메소드 호출 결과 출력 */
		System.out.println(result);
	}
}
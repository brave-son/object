package snippet;

import java.util.Scanner;

public class Exam06_5_Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Exam06_5_Human human = new Exam06_5_Human();
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		String type = sc1.nextLine();
		int age = sc1.nextInt();

		human.setName(name);
		human.setType(type);
		human.setAge(age);

		/* BloodHouse ��ü ���� */
		Exam06_5_BloodHouse bloodhouse = new Exam06_5_BloodHouse();

		String result = bloodhouse.action(human); // action() �޼ҵ� ȣ�� ��� ����
		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}
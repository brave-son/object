package snippet;

import java.util.Scanner;

public class Exam06_5_BloodHouse {
	public boolean isPossible(Exam06_5_Human human) {
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����

		boolean isPossible = false;
		age = human.getAge();
		if (age > 15 && age < 70) {
			isPossible = true;

		} else {

		}

		// ���� ���� ����
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		return isPossible;
	}

	public String action(Exam06_5_Human human) {
		boolean res = isPossible(human);
		if (res) {
			String result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�.";

		} else {
			String result = "������ �Ұ����մϴ�.";
		}
		String result = ""; // ���� ��� ����
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		
		return result;
	}
}
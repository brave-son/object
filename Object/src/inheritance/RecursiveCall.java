package inheritance;

public class RecursiveCall {
	public static void main(String[] args) {
		System.out.println("���ȣ�� ����");
		int number = 5;
		long result = factorial(number);
		System.out.println("���ȣ�� ��� : " + result);
		System.out.println("���ȣ�� ��");
	}

	public static long factorial(int n) {
		long result = 0;
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}
		return result;
	}
}
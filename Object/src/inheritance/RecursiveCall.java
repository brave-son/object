package inheritance;

public class RecursiveCall {
	public static void main(String[] args) {
		System.out.println("재귀호출 시작");
		int number = 5;
		long result = factorial(number);
		System.out.println("재귀호출 결과 : " + result);
		System.out.println("재귀호출 끝");
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
public class Exam06_2 {

	int plus(int v1, int v2) {
		return v1 + v2;
	}

	int minus(int v1, int v2) {
		return v1 - v2;
	}

	public static void main(String[] args) {
		Exam06_2 e = new Exam06_2();

		int result1 = 0;
		result1 = e.plus(5, 3);
		System.out.println(result1);
// result1 변수에 plus 메소드 호출 결과 저장
// plus 메소드 호출 예) xx.plus(5, 3);
		int result2 = 0;
		result2 = e.minus(5, 3);
		System.out.println(result2);
// result2 변수에 minus 메소드 호출 결과 저장
// minus 메소드 호출 예) xx.minus(5, 3);
	}
// plus 메소드 작성
// minus 메소드 작성
}
package methodExam;

public class Diff_sum {

	public int diff_sum(int n1, int n2, int n3) {
		int result = 0;
		int sum = n1 + n2 + n3;
		int diff = (n1 * n1) + (n2 * n2) + (n3 * n3);
		if (sum > diff) {
			result = sum - diff;

		} else {
			result = diff - sum;
		}
		return result;
		

	}
}

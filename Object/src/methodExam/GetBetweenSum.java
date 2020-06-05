package methodExam;

public class GetBetweenSum {
	int getBetweenSum(int a, int b) {
		int result = 0;
		if (a > b) {
			for (int i = b; i <= a; i++) {
				result +=  i;
			}

		} else if (a < b) {
			for (int i = a; i <= b; i++) {
				result +=  i;
			}

		} else {
			result = a;

		}
		

		return result;

	}

}

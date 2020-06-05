package methodExam;

public class GetLastYear {
	int getLastYear(int n) {
		int result = 0 ;
		if (n == 1 && n == 3 && n == 5 && n == 7 && n == 8 && n == 10 && n == 12) {
			result = 31;

		} else if (n == 4 && n == 6 && n == 9 && n == 11) {
			result = 30;

		} else if (n == 2) {
			result = 28;
		}

		return result;

	}

}

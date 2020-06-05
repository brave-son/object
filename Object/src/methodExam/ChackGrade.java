package methodExam;

public class ChackGrade {
	int result = 0;

	int chackGrade(int n) {

		if (n > 10) {
			result = 1;
		} else if (n > 6) {
			result = 2;
		} else if (n > 3) {
			result = 3;
		} else {
			result = 4;

		}
		return result;

	}

}
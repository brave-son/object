package methodExam;

public class Check_year {
	public String check_year(int n) {
		String result = "";
		if ((n % 4 == 0) || ( n % 100) != 0) {
			if (n % 400 == 0) {
				result = "윤년입니다.";
			} else {
				result = "평년입니다.";
			}

		}else {
			result = "....";
		}
		return result;

	}
}

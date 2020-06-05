package methodExam;

public class Dillemma {
	 
	
	public String dillemma(boolean a, boolean b) {
		String result = null;
		if (a ==true && b == true) {
			result = "A B 둘 다 5년 복역.";
				
		} else if (a == true && b == false) {
			result = "A 석방, B 10년 복역 ";
					
		} else if (a == false && b == true) {
			result = "A 10년 복역, B 석방.";
		} else if (a == false && b == false) {
			result = "A, B 둘 다 1년 복역";
			
		}
		
		return result;
		
		
		
	}

}

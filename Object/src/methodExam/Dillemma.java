package methodExam;

public class Dillemma {
	 
	
	public String dillemma(boolean a, boolean b) {
		String result = null;
		if (a ==true && b == true) {
			result = "A B �� �� 5�� ����.";
				
		} else if (a == true && b == false) {
			result = "A ����, B 10�� ���� ";
					
		} else if (a == false && b == true) {
			result = "A 10�� ����, B ����.";
		} else if (a == false && b == false) {
			result = "A, B �� �� 1�� ����";
			
		}
		
		return result;
		
		
		
	}

}

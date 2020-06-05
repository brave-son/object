
public class MethodExam {
	int getMaxValue(int v1, int v2) {
		if (v1>v2) {
			return v1;
			
			
		} else {return v2;

		}
		
	}
public static void main(String[] args) {
	MethodExam e = new MethodExam();
	int max = e.getMaxValue(100, 101);
	System.out.println(max);
	
}
}

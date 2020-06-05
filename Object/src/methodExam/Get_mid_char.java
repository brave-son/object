package methodExam;

public class Get_mid_char {
	String get_mid_char(String s) {
		String result = "";
		int mid;
		mid = s.length()/2;
		
		if (s.length()%2==0) {
			mid = s.length()/2;
			result=s.substring(mid , mid+1 );
		} else if (s.length()%2 !=0) {
			mid = s.length()/2;
			result=s.substring(mid, mid +2);
			
		} else {

		}{

		}
		
		
		return result;
		
	}

}

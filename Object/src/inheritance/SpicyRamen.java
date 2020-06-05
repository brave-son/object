package inheritance;

public class SpicyRamen extends Ramen { // 상속 코드
	public SpicyRamen(String name) {
		super.name = name;

		

	}
@Override
	public String getTaste() {
		
		return "매운라면 맛";
		
	}

	// TODO Auto-generated method stub

}

package inheritance;

public class SaltyRamen extends Ramen { // 상속 코드

	public SaltyRamen(String name) {
		super.name = name;
	}
// 오버라이드 코드

	@Override
	public String getTaste() {
		
		return "짠 라면맛";
	}

	// TODO Auto-generated method stub

}

package inheritance;

public class SaltyRamen extends Ramen { // ��� �ڵ�

	public SaltyRamen(String name) {
		super.name = name;
	}
// �������̵� �ڵ�

	@Override
	public String getTaste() {
		
		return "§ ����";
	}

	// TODO Auto-generated method stub

}

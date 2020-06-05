package inheritance;

public class Tank implements Unit {
	private String color;

	Tank(String color) {
		this.color = color;
	}

	@Override
	public String move(String area) {
		System.out.println(area + " ��ġ�� ��ũ �̵�");
		return area;
	}

	@Override
	public String attack(String target) {
		System.out.println("������ ����Ͽ� " + target + " ����");
		return target;
	}
}
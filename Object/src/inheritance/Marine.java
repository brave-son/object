package inheritance;

public class Marine implements Unit {
	private String color;

	Marine(String color) {
		this.color = color;
	}

	@Override
	public String move(String area) {
		System.out.println(area + " ��ġ�� ���� �̵�");
		return area;
	}

	@Override
	public String attack(String target) {
		System.out.println("���� ����Ͽ� " + target + " ����");
		return target;
	}
}
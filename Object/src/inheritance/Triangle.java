package inheritance;

public class Triangle extends Figure {
	@Override
	public void area(int a, int b) {
		System.out.println("�ﰢ���� ���� : " + (a * b / 2));
	}
}
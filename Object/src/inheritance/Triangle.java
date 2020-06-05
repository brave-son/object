package inheritance;

public class Triangle extends Figure {
	@Override
	public void area(int a, int b) {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + (a * b / 2));
	}
}
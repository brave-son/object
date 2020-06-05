package inheritance;

public class Marine implements Unit {
	private String color;

	Marine(String color) {
		this.color = color;
	}

	@Override
	public String move(String area) {
		System.out.println(area + " 위치로 마린 이동");
		return area;
	}

	@Override
	public String attack(String target) {
		System.out.println("총을 사용하여 " + target + " 공격");
		return target;
	}
}
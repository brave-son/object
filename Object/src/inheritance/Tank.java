package inheritance;

public class Tank implements Unit {
	private String color;

	Tank(String color) {
		this.color = color;
	}

	@Override
	public String move(String area) {
		System.out.println(area + " 위치로 탱크 이동");
		return area;
	}

	@Override
	public String attack(String target) {
		System.out.println("대포를 사용하여 " + target + " 공격");
		return target;
	}
}
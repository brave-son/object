
public class House {
	public static void main(String[] args) {
		User user = new User();
		user.age = 20;
		user.name = "ȫ�浿";
		Car car = new Car();
		car.tire = 4;
		car.engine = 3.0;
		car.brand = "����";
		user.car = car;
		System.out.println(user);

		User user2 = new User();
		user2.age = 30;
		user2.name = "��û��";
		user2.car = car;
		System.out.println(user2);

	}

}

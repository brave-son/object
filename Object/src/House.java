
public class House {
	public static void main(String[] args) {
		User user = new User();
		user.age = 20;
		user.name = "È«±æµ¿";
		Car car = new Car();
		car.tire = 4;
		car.engine = 3.0;
		car.brand = "¹êÃ÷";
		user.car = car;
		System.out.println(user);

		User user2 = new User();
		user2.age = 30;
		user2.name = "½ÉÃ»ÀÌ";
		user2.car = car;
		System.out.println(user2);

	}

}

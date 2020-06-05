
public class User {
	int age;
	String name;
	Car car;
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", car=" + car + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >0 && age<150) {
			return;
			
			
		} this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

}

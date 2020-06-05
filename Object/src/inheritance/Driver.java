package inheritance;

public class Driver {
	public void action(Car c) {
		c.move();
		
		
	}
	public void action(Ray r) {
		r.move();

	}

	public void action(Taxi t) {
		t.move();

	}


}
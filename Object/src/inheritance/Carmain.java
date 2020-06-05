package inheritance;

public class Carmain {
	public static void main(String[] args) {
		Driver d = new Driver();
		
		
		Taxi t = new Taxi();
		d.action(t);
		
		
		
		Ray r = new Ray();
		d.action(r);
		

	}

}

package inheritance;

public interface Unit {
// public static final String COLOR_TANK = "BROWN"
	String COLOR_TANK = "BROWN";
// public static final String COLOR_MARINE = "BLUE";
	String COLOR_MARINE = "BLUE";
	

 //public abstract void move(String area);
	String move(String area);

// public abstract void attack(String target);
	String attack(String target);
}
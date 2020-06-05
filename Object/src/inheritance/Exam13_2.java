package inheritance;

import java.util.Set;
import java.util.TreeSet;

public class Exam13_2 {
	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<Integer>();
		set.add(2);
		set.add(5);
		set.add(11);
		set.add(13);
		set.add(25);
		set.add(28);
		Set<Integer> myNumber = new TreeSet<Integer>();
		int count = 0;
		while (true) {
			for (int i = 0; i < set.size(); i++) {
				myNumber.add((int) (Math.random() * 50));
			}
			System.out.println(set);
			System.out.println(myNumber);
			System.out.println( count);
			if (myNumber.containsAll(set)) {

				break;
			}
			myNumber.clear();
			count++;
		}
		System.out.println("½ÃµµÈ½¼ö : " + count);
	}

}

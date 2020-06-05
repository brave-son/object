package inheritance;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExam {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(32);
		set.add(2);
		set.add(321);
		set.add(322);
		set.add(323);
		set.add(325);
		set.add(3267);
		set.add(328);
		set.add(320);
		set.add(329);
		set.add(3212);
		set.add(3233);
		Set<Integer> set2 = new TreeSet<>();
		set.add(32);
		set.add(2);

		set.add(325);
		set.add(3267);
		set.add(328);
		set.add(32);
		set.add(329);
		set.add(3212);
		set.add(3233);
		System.out.println(set.containsAll(set2));
	}

}

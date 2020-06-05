package inheritance;

import java.util.Scanner;

public class 막대기자르기 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] sticks = new int[num];
		for (int i = 0; i < num; i++) {
			sticks[i] = s.nextInt();
		}
		while (true) {

			int count = 0;
			for (int i = 0; i < num; i++) {
				if (sticks[i] > 0) {
					count++;
				}
			}
			if (count == 0) {
				break;
			}
			System.out.println("현재 막대기의 갯수:" + count);

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < num; i++) {
				if (sticks[i] < min && sticks[i] > 0) {
					min = sticks[i];
				}
			}
			for (int i = 0; i < num; i++) {
				sticks[i] = sticks[i] - min;
			}

		}
	}
}

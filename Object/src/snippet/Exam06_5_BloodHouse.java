package snippet;

import java.util.Scanner;

public class Exam06_5_BloodHouse {
	public boolean isPossible(Exam06_5_Human human) {
		int age = 0; // ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå

		boolean isPossible = false;
		age = human.getAge();
		if (age > 15 && age < 70) {
			isPossible = true;

		} else {

		}

		// ÇåÇ÷ °¡´É ¿©ºÎ
		/* ³Ñ°Ü¹ŞÀº Human Å¬·¡½º·ÎºÎÅÍ age Á¤º¸ È®ÀÎ age = ? */
		/* age°¡ 16¼¼ ÀÌ»ó 69¼¼ ÀÌÇÏ ÀÏ¶§¸¸ ÇåÇ÷ °¡´ÉÇÏµµ·Ï Á¶°Ç¹® ÀÛ¼º */
		return isPossible;
	}

	public String action(Exam06_5_Human human) {
		boolean res = isPossible(human);
		if (res) {
			String result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù.";

		} else {
			String result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù.";
		}
		String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
		/* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ÀÛ¼º */
		/* ÇåÇ÷ °¡´É ½Ã result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù. */
		
		return result;
	}
}
package inheritance;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam13_3_1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "apple");
		map.put("b", "banana");
		map.put("c", "cherry");
		map.put("g", "grape");
		map.put("l", "lemon");
		map.put("m", "mango");
		map.put("o", "orange");
		map.put("t", "tomato");
		map.put("w", "watermelon");
		/* 코드작성 */
		Set<String> keyset = map.keySet();
		for (String key: keyset) {
			String value = map.get(key);
				System.out.println(key +":"+value);		
		}
	}
}
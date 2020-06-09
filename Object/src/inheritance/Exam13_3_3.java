package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exam13_3_3 {
	public static void main(String[] args) {
		Map<Integer, List<String>> map = new HashMap<>();

		List<String> list19 = new ArrayList<String>();
		list19.add("문재인");
		list19.add("홍준표");
		list19.add("안철수");
		list19.add("유승민");
		list19.add("심상정");
		list19.add("조원진");
		list19.add("오영국");
		list19.add("장성민");
		list19.add("이재오");
		list19.add("김선동");
		list19.add("이경희");
		list19.add("윤홍식");
		list19.add("김민찬");
		map.put(19, list19);

		List<String> list18 = new ArrayList<String>();
		list18.add("박근혜");
		list18.add("문재인");
		list18.add("박종선");
		list18.add("김소연");
		list18.add("강지원");
		list18.add("김순자");
		map.put(18, list18);
		/* 코드작성 */
		Set<Integer> keyset = map.keySet();
		for (int key : keyset) {
			System.out.printf("\n 제 %s대 대통령선거 후보자 \n", key);
			List<String> value = map.get(key);
			int count = 0;

			for (String ele : value) {
				count++;
				if (count % 5 == 0) {
					System.out.println(ele);

				} else {
					System.out.print(ele + " ");

				}

			}
		}

	}
}
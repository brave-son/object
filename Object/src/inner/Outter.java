package inner;

public class Outter {
	 int age = 10;
	
	void method() {// 스텍영역에 형성

		
		class Inner {// 클래스는 힙 영역에 만들어짐
			void m() {
				System.out.println(age);
				age ++;
				

			}
		}
 
	}

}

package inner;

public class Outter {
	 int age = 10;
	
	void method() {// ���ؿ����� ����

		
		class Inner {// Ŭ������ �� ������ �������
			void m() {
				System.out.println(age);
				age ++;
				

			}
		}
 
	}

}

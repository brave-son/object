package inheritance;

public class Anonymous {
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("������");
		}
	};

	void method1() {
 Vehicle localVar = new Vehicle() {
	
	@Override
	public void run() {
		System.out.println("�¿���");
		// TODO Auto-generated method stub
		
	}
};
 localVar.run();
 }

	void method2(Vehicle v) {
		v.run();
	}
}
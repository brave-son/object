package inheritance;

public class Exam07_2_LG_RemoteControl extends Exam07_2_RemoteControl {

	@Override
	public void channelUp() {
System.out.println("LG ������ = Channal Up");

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("LG ������ = Channal Down");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LG ������ = volume Up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LG ������ = volume Down");
	}

//	public String channelUp() {
//		("LG ������  =>"+ "channel up") ;
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void channelDown() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void volumeUp() {
//		// TODO Auto-generated method stub
//		super.volumeUp();
//	}
//
//	@Override
//	public void volumeDown() {
//		// TODO Auto-generated method stub
//		super.volumeDown();
//	}
	/* �޼ҵ� �������̵� */
	
}
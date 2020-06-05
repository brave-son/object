package inheritance;

public class Exam07_2_LG_RemoteControl extends Exam07_2_RemoteControl {

	@Override
	public void channelUp() {
System.out.println("LG 리모컨 = Channal Up");

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("LG 리모컨 = Channal Down");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LG 리모컨 = volume Up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LG 리모컨 = volume Down");
	}

//	public String channelUp() {
//		("LG 리모컨  =>"+ "channel up") ;
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
	/* 메소드 오버라이드 */
	
}
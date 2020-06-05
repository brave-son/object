package inheritance;

public class Exam07_2_SAMSUNG_RemoteControl extends Exam07_2_RemoteControl
{

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung 리모컨 = channal Up");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsung 리모컨 = channal Down");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung 리모컨 = volume Up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsung 리모컨 = volume Down");
	}
	/* 메소드 오버라이드 */
}
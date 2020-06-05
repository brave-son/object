package inheritance;

public class Exam07_2_Main {
	public static void main(String[] args) {
		Exam07_2_RemoteControl rc1 = new Exam07_2_LG_RemoteControl();
		rc1.channelUp();
		rc1.channelDown();
		rc1.volumeUp();
		rc1.volumeDown();
		Exam07_2_RemoteControl rc2 = new Exam07_2_SAMSUNG_RemoteControl();
		rc2.channelUp();
		rc2.channelDown();
		rc2.volumeUp();
		rc2.volumeDown();
	}
}

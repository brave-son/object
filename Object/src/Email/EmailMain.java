package Email;

public class EmailMain {
	public static void main(String[] args) {
		String to = "solochang@naver.com";
		String subject = "�ݰ����ϴ�.";
		String content = "������ ���ϵ帳�ϴ�.";
		SMTPAuthenticator smtp = new SMTPAuthenticator();
		Mailer mailer = new Mailer();
		mailer.sendMail(to, subject, content, smtp);
	}
}
package inheritance;

public class Exam09_1_Chatting {
	void startChat(String chatId) {
		final String nickName = chatId;
		

		class Chat {
			public void start() {
				while (true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {

			}
		}

		Chat chat = new Chat();
		chat.start();
	}
}
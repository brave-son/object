import java.awt.Color;
import java.lang.ProcessBuilder.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		JButton btn = new JButton("버튼");
		frame.add(btn);
		btn.setBackground(Color.CYAN);

		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
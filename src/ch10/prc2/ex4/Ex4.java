package ch10.prc2.ex4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex4 extends JFrame {

	public Ex4() {
		setTitle("Left 키로 문자열 교체");
		setSize(300, 200);
		setDefaultCloseOperation(3);

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel label = new JLabel("Love Java");
		c.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					String text = label.getText();
					label.setText(text.substring(1) + text.substring(0, 1));
				}
			}

		});
		c.add(label);
		c.setFocusable(true);
		c.requestFocus();

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex4();
	}

}

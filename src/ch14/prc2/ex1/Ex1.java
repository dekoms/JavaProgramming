package ch14.prc2.ex1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ex1 extends JFrame {

	public Ex1() {
		setTitle("새로운 버튼 만들기");
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyButton button = new MyButton("New Button");
		button.setOpaque(true);
		button.setBackground(Color.CYAN);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				int red = random.nextInt(256);
				int green = random.nextInt(256);
				int blue = random.nextInt(256);
			button.setBackground(new Color(red, green, blue));
			}
		});
		c.add(button);

		setVisible(true);
	}

	class MyButton extends JButton {
		public MyButton(String s) {
			super(s);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
		}

	}

	public static void main(String[] args) {
		new Ex1();

	}

}

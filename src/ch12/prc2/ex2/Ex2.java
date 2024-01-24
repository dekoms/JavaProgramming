package ch12.prc2.ex2;

import java.awt.*;
import javax.swing.*;

public class Ex2 extends JFrame {

	public Ex2() {
		setTitle("¹®Á¦2");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel panel = new MyPanel();
		setContentPane(panel);

		setVisible(true);
	}

	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.fillArc(60, 20, 100, 100, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(60, 20, 100, 100, 210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(60, 20, 100, 100, 330, 120);

		}

	}

	public static void main(String[] args) {
		new Ex2();

	}

}

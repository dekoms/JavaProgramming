package ch12.prc2.ex3;

import java.awt.*;
import javax.swing.*;

public class Ex3 extends JFrame {

	public Ex3() {
		setTitle("Ä¿ÇÇ");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel panel = new MyPanel();
		setContentPane(panel);

		setVisible(true);
	}

	class MyPanel extends JPanel {
		Image imgA = new ImageIcon("images/1.gif").getImage();
		Image imgB = new ImageIcon("images/2.gif").getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int width = getWidth();
			int height = getHeight();
			
			g.drawImage(imgA, 0, 0, width/2, height, this);
			g.drawImage(imgB, width/2, 0, width/2, height, this);
			
		}

	}

	public static void main(String[] args) {
		new Ex3();

	}

}

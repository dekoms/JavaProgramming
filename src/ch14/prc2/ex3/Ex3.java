package ch14.prc2.ex3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex3 extends JFrame {

	public Ex3() {
		setTitle("이미지 위에 원 드래깅 연습");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel myPanel = new MyPanel();
		setContentPane(myPanel);

		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		private int ovalX = 100, ovalY = 100;

		public MyPanel() {
			addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {

				}

				@Override
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 40, 40);
		}
	}

	public static void main(String[] args) {
		new Ex3();

	}

}

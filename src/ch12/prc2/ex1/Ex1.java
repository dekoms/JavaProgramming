package ch12.prc2.ex1;

import java.awt.*;
import javax.swing.*;

public class Ex1 extends JFrame {

	public Ex1() {
		setTitle("¹®Á¦1");
		setSize(230, 300);
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
			g.drawRect(50, 10, 50, 50);
			g.fillRect(110, 10, 50, 50);
			
			g.setColor(Color.ORANGE);
			g.fillOval(50, 70, 50, 50);
			g.drawOval(110, 70, 50, 50);
			
			g.setColor(Color.GREEN);
			g.drawRoundRect(50, 130, 50, 50, 20, 20);
			g.fillRoundRect(110, 130, 50, 50, 20, 20);
			
			g.setColor(Color.MAGENTA);
			g.fillArc(80, 190, 50, 50, 0, 180);
			g.setFont(new Font("Arial", Font.BOLD, 26));
			g.drawString("We win!!", 50, 240);

		}
		
	}

	public static void main(String[] args) {
		new Ex1();

	}

}

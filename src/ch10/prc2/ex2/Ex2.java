package ch10.prc2.ex2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex2 extends JFrame {

	public Ex2() {
		setTitle("µå·¡±ëµ¿¾È Yellow");
		setSize(300, 200);
		setDefaultCloseOperation(3);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				Container temp = (Container) e.getSource();
				temp.setBackground(Color.YELLOW);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Container temp = (Container) e.getSource();
				temp.setBackground(Color.GREEN);
			}

		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex2();

	}

}

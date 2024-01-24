package ch10.prc2.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1 extends JFrame {

	public Ex1() {
		setTitle("���콺 �ø��� ������");
		setSize(300, 200);
		setDefaultCloseOperation(3);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel temp = (JLabel) e.getSource();
				temp.setText("�����");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				JLabel temp = (JLabel) e.getSource();
				temp.setText("Love Java");
			}
		});
		c.add(label);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();

	}

}

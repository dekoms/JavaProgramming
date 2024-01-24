package ch9.prc2.ex8;

import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		for(int i=0;i<20;i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			JLabel label = new JLabel("*");
			label.setForeground(Color.RED);
			label.setLocation(x,y);
			label.setSize(20,20);
			label.setOpaque(true);
			add(label);
		}
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		add(new JButton("Integer Input"));
		add(new TextField(15));
	}
}

public class Ex8 extends JFrame{
	
	public Ex8() {
		setTitle("���� ���� �г��� ���� ������");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NorthPanel northPanel = new NorthPanel();
		CenterPanel centerPanel = new CenterPanel();
		SouthPanel southPanel = new SouthPanel();
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex8();
		
	}

}

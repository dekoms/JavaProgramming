package ch9.prc2.ex2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2 extends JFrame{

	public Ex2() {
		setTitle("BorderLayout Practice");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout(5,7));
		
		container.add(new JButton("North"), BorderLayout.NORTH);
		container.add(new JButton("West"), BorderLayout.WEST);
		container.add(new JButton("Center"), BorderLayout.CENTER);
		container.add(new JButton("East"), BorderLayout.EAST);
		container.add(new JButton("South"), BorderLayout.SOUTH);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex2();
		
	}

}

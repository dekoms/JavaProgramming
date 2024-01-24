package ch14.prc2.ex2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex2 extends JFrame{

	public Ex2() {
		setTitle("이미지 연습");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel myPanel = new MyPanel();
		setContentPane(myPanel);
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();
		JButton button = new JButton("Hide/Show");
		boolean showFlag = true;
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(button);
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					showFlag = !showFlag;
					repaint();
				}
			});
			
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(showFlag)
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new Ex2();
		
	}

}

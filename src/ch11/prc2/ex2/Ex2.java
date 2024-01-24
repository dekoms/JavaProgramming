package ch11.prc2.ex2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ex2 extends JFrame {

	ImageIcon snowIcon = new ImageIcon("images/gif1.gif");
	ImageIcon coffeeIcon = new ImageIcon("images/gif2.gif");
	ImageIcon kakaoIcon = new ImageIcon("images/gif3.gif");
	ImageIcon christmasIcon = new ImageIcon("images/gif4.gif");

	public Ex2() {
		setTitle("라디오버튼 Item Event 예제");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		c.add(panel, BorderLayout.NORTH);

		JRadioButton snowBtn = new JRadioButton("눈");
		JRadioButton coffeeBtn = new JRadioButton("커피");
		JRadioButton kakaoBtn = new JRadioButton("카카오");
		JRadioButton christmasBtn = new JRadioButton("크리스마스");

		ButtonGroup group = new ButtonGroup();
		group.add(snowBtn);
		group.add(coffeeBtn);
		group.add(kakaoBtn);
		group.add(christmasBtn);

		panel.add(snowBtn);
		panel.add(coffeeBtn);
		panel.add(kakaoBtn);
		panel.add(christmasBtn);

		JLabel label = new JLabel();
		c.add(label, BorderLayout.CENTER);

		christmasBtn.setSelected(true);
		label.setIcon(christmasIcon);
		label.setHorizontalAlignment(SwingConstants.CENTER);

		snowBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					label.setIcon(snowIcon);
				}
			}
		});
		coffeeBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					label.setIcon(coffeeIcon);
				}
			}
		});
		kakaoBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					label.setIcon(kakaoIcon);
				}
			}
		});
		christmasBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					label.setIcon(christmasIcon);
				}
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex2();

	}

}

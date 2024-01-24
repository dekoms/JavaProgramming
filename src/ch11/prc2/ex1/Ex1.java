package ch11.prc2.ex1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex1 extends JFrame {

	public Ex1() {
		setTitle("CheckBox Practice");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JCheckBox deactivateBtn = new JCheckBox("버튼 비활성화");
		JCheckBox hideBtn = new JCheckBox("버튼 감추기");
		JButton button = new JButton("test button");
		c.add(deactivateBtn);
		c.add(hideBtn);
		c.add(button);

		deactivateBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					button.setEnabled(false);
				} else {
					button.setEnabled(true);
				}
			}
		});
		hideBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					button.setVisible(false);
				} else {
					button.setVisible(true);
				}
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();

	}

}

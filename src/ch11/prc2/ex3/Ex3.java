package ch11.prc2.ex3;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex3 extends JFrame {

	public Ex3() {
		setTitle("JTextField and JComponent");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JTextField textField = new JTextField(10);
		JComboBox<String> comboBox = new JComboBox<>();
		c.add(textField);
		c.add(comboBox);

		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField) e.getSource();
				comboBox.addItem(text.getText());
				text.setText("");
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex3();

	}

}

package ch11.prc2.ex4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ex4 extends JFrame {

	JLabel imageLabel;
	ImageIcon[] image = new ImageIcon[4];
	int currentId = 0;

	public Ex4() {
		setTitle("¿ÃπÃ¡ˆ");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Menu menu = new Menu();
		c.add(imageLabel, BorderLayout.CENTER);
		c.add(menu, BorderLayout.SOUTH);

		for (int i = 0; i < 4; i++) {
			image[i] = new ImageIcon("images/image" + i + ".jpg");
		}

		imageLabel.setIcon(image[currentId]);

		setVisible(true);
	}

	class Menu extends JPanel {
		public Menu() {
			setBackground(Color.GRAY);
			ImageIcon leftIcon = new ImageIcon("images/left.png");
			ImageIcon rightIcon = new ImageIcon("images/right.png");
			JButton leftBtn = new JButton(leftIcon);
			JButton rightBtn = new JButton(rightIcon);

			add(leftBtn);
			add(rightBtn);

			leftBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					currentId--;
					if (currentId < 0)
						currentId += 4;
					currentId %= 4;
					imageLabel.setIcon(image[currentId]);
				}
			});

			rightBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					currentId++;
					currentId %= 4;
					imageLabel.setIcon(image[currentId]);
				}
			});
		}

	}

	public static void main(String[] args) {
		new Ex4();

	}

}

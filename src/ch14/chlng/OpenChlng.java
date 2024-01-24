package ch14.chlng;

import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class OpenChlng extends JFrame {

	Container c;
	int cup = 5, coffee = 5, water = 5, sugar = 5, cream = 5;

	public OpenChlng() {
		setTitle("Java Programming Report");
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel northPanel = new JPanel();
		c.add(northPanel, BorderLayout.NORTH);
		northPanel.add(new JLabel("Welcome, Hot Coffee !!"));
		northPanel.setBackground(Color.GREEN);

		CenterPanel centerPanel = new CenterPanel();
		c.add(centerPanel, BorderLayout.CENTER);

		JPanel southPanel = new JPanel();
		c.add(southPanel, BorderLayout.SOUTH);

		JButton blackCoffeeBtn = new JButton("Black Coffee");
		JButton sugarCoffeeBtn = new JButton("Sugar Coffee");
		JButton dabangCoffeeBtn = new JButton("Dabang Coffee");
		JButton resetBtn = new JButton("Reset");
		southPanel.add(blackCoffeeBtn);
		southPanel.add(sugarCoffeeBtn);
		southPanel.add(dabangCoffeeBtn);
		southPanel.add(resetBtn);

		BtnListener btnListener = new BtnListener();
		blackCoffeeBtn.addActionListener(btnListener);
		sugarCoffeeBtn.addActionListener(btnListener);
		dabangCoffeeBtn.addActionListener(btnListener);
		resetBtn.addActionListener(btnListener);

		setVisible(true);
	}

	class BtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String btnStr = e.getActionCommand();

			if (btnStr.equals("Black Coffee")) {
				if (cup > 0 && coffee > 0 && water > 0) {
					cup--;
					coffee--;
					water--;
					repaint();
					JOptionPane.showMessageDialog(c, "뜨거워요. 즐거운 하루~~", "커피나왔습니다.", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(c, "부족한 것이 있습니다. 채워주세요.", "커피 자판기 경고", JOptionPane.ERROR_MESSAGE);
				}
			} else if (btnStr.equals("Sugar Coffee")) {
				if (cup > 0 && coffee > 0 && water > 0 && sugar > 0) {
					cup--;
					coffee--;
					water--;
					sugar--;
					repaint();
					JOptionPane.showMessageDialog(c, "뜨거워요. 즐거운 하루~~", "커피나왔습니다.", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(c, "부족한 것이 있습니다. 채워주세요.", "커피 자판기 경고", JOptionPane.ERROR_MESSAGE);
				}
			} else if (btnStr.equals("Dabang Coffee")) {
				if (cup > 0 && coffee > 0 && water > 0 && sugar > 0 && cream > 0) {
					cup--;
					coffee--;
					water--;
					sugar--;
					cream--;
					repaint();
					JOptionPane.showMessageDialog(c, "뜨거워요. 즐거운 하루~~", "커피나왔습니다.", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(c, "부족한 것이 있습니다. 채워주세요.", "커피 자판기 경고", JOptionPane.ERROR_MESSAGE);
				}
			} else if (btnStr.equals("Reset")) {
				cup = coffee = water = sugar = cream = 5;
				repaint();
			}

		}

	}

	class CenterPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int x = getWidth() / 8;
			int intervalX = getWidth() / 6;
			int y = (int) (getHeight() * 0.2);
			int intervalY = (int) (getHeight() * 0.5);

			g.setColor(Color.GRAY);
			g.fillRect(x, y + intervalY - (cup * (intervalY / 5)), 50, cup * (intervalY / 5));
			g.fillRect(x + intervalX, y + intervalY - (coffee * (intervalY / 5)), 50, coffee * (intervalY / 5));
			g.fillRect(x + 2 * intervalX, y + intervalY - (water * (intervalY / 5)), 50, water * (intervalY / 5));
			g.fillRect(x + 3 * intervalX, y + intervalY - (sugar * (intervalY / 5)), 50, sugar * (intervalY / 5));
			g.fillRect(x + 4 * intervalX, y + intervalY - (cream * (intervalY / 5)), 50, cream * (intervalY / 5));

			g.setColor(Color.BLACK);
			g.drawRect(x, y, 50, (int) (getHeight() * 0.5));
			g.drawRect(x + intervalX, y, 50, (int) (getHeight() * 0.5));
			g.drawRect(x + 2 * intervalX, y, 50, (int) (getHeight() * 0.5));
			g.drawRect(x + 3 * intervalX, y, 50, (int) (getHeight() * 0.5));
			g.drawRect(x + 4 * intervalX, y, 50, (int) (getHeight() * 0.5));

			g.drawString("Cup", (int) 1.5 * x, (int) (getHeight() * 0.75));
			g.drawString("Coffee", (int) 1.5 * x + intervalX, (int) (getHeight() * 0.75));
			g.drawString("Water", (int) 1.5 * x + 2 * intervalX, (int) (getHeight() * 0.75));
			g.drawString("Sugar", (int) 1.5 * x + 3 * intervalX, (int) (getHeight() * 0.75));
			g.drawString("Cream", (int) 1.5 * x + 4 * intervalX, (int) (getHeight() * 0.75));

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = toolkit.getImage("c:\\Temp\\coffee.jpg");
			g.drawImage(image, getWidth() * 2 / 5, getHeight() * 3 / 4, null);
		}

	}

	public static void main(String[] args) {
		new OpenChlng();

	}

}

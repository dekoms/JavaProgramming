package ch4.prc2.ex6;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getCircleArea() {
		return 3.14 * radius * radius;
	}

	public void biggestCircleShow() {
		System.out.println("가장 면적인 큰 원은 (" + x + "," + y + ")" + radius);
	}
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circle[] c = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}

		// 좀 더 깔끔한 알고리즘 없나?
		int biggestIndex = 0;
		double max = 0.0;
		for (int i = 0; i < c.length; i++) {
			if (c[i].getCircleArea() >= max) {
				max = c[i].getCircleArea();
				biggestIndex = i;
			}
		}

		c[biggestIndex].biggestCircleShow();

		sc.close();

	}

}

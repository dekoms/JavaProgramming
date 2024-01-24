package ch6.prc2.ex2;

class Circle {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
//		Circle a = new Circle(1,2,3);
//		int num = a.x;
		if (x == c.x && y == c.y)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")������" + radius;
	}

}

public class Ex2 {

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);

		System.out.println("�� a: " + a);
		System.out.println("�� b: " + b);

		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");

	}

}

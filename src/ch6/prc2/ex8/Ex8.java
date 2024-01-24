package ch6.prc2.ex8;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point c = (Point) obj;
		if (x == c.x && y == c.y)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

}

public class Ex8 {

	public static void main(String[] args) {
		Point a = new Point(3,50);
		Point b = new Point(4,50);

		System.out.println(a);
		System.out.println(b);

		if (a.equals(b))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}

}

package ch5.prc2.ex8;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);
		if (x < 0 || y < 0) {
			move(0, 0);
		}
		// 그냥 super.move 사용하는게 올바른건가?
		// 생성자는 객체를 초기화하는 목적을 지녔으니 해당 객체의 메소드를 사용하는 것은 지양해야 하나?
	}

	@Override
	protected void move(int x, int y) {
		if (x < 0 || y < 0) {
			return;
		}
		super.move(x, y);
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");

	}

}

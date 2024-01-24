package ch4.prc2.ex4;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}

	public int square() {
		return width * height;
	}

	// 좌표가 음수인 경우에도 실행되나?
	public boolean contains(Rectangle r) {
		return ((x <= r.x) && (x + width >= r.x + r.width)) && ((y <= r.y) && (y + height >= r.y + r.height));
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s를 포함합니다.");

	}

}

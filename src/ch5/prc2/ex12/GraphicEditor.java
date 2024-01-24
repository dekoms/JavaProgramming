package ch5.prc2.ex12;

import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	abstract public void draw();
}

class Line extends Shape {

	public Line() {
		super();
	}

	@Override
	public void draw() {
		System.out.println("Line");
	}

}

class Rect extends Shape {

	public Rect() {
		super();
	}

	@Override
	public void draw() {
		System.out.println("Rect");
	}

}

class Circle extends Shape {

	public Circle() {
		super();
	}

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}

public class GraphicEditor {
	
	private static Shape start = null;

	public static void insert(int shape) {
		Shape p = start;

		if (p == null) {
			if (shape == 1) {
				Line line = new Line();
				p = line;
			} else if (shape == 2) {
				Rect rect = new Rect();
				p = rect;
			} else if (shape == 3) {
				Circle circle = new Circle();
				p = circle;
			}
		} else {
			for (; p.getNext() != null; p = p.getNext());
			if (shape == 1) {
				Line line = new Line();
				p.setNext(line);
			} else if (shape == 2) {
				Rect rect = new Rect();
				p.setNext(rect);
			} else if (shape == 3) {
				Circle circle = new Circle();
				p.setNext(circle);
			}
		}
	}

	public static void delete(int location) {
		Shape p = start;
		
		if (p == null) {
			System.out.println("������ �� �����ϴ�.");
		} else {
			for (int i = 1; i < location; p = p.getNext());
			p.setNext(null);
		}
	}

	public static void printAll() {
		Shape p = start;
		for (; p != null; p = p.getNext()) {
			p.getNext().draw();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		int input;
		while (true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int shape = sc.nextInt();
				insert(shape);
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
				int location = sc.nextInt();
				delete(location);
				break;
			case 3:
				printAll();
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				sc.close();
				System.exit(0);
			}
		}

	}

}

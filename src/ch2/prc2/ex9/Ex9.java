package ch2.prc2.ex9;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է�>>");
		int x0 = sc.nextInt();
		int y0 = sc.nextInt();
		double radius = sc.nextDouble();

		System.out.print("�� �Է�>>");
		double x = sc.nextInt();
		double y = sc.nextInt();

		double distance = Math.sqrt(Math.pow((x - x0), 2) + Math.pow((y - y0), 2));

		if (distance <= radius)
			System.out.println("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� (" + x + ", " + y + ")�� �� �ۿ� �ִ�.");

		sc.close();

	}

}

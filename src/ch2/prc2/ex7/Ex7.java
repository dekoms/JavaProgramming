package ch2.prc2.ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int minX = 100, minY = 100;
		int maxX = 200, maxY = 200;

		if ((x >= minX && x <= maxX) && (y >= minY && y <= maxY)) {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ۿ� �ֽ��ϴ�.");
		}

		sc.close();

	}

}

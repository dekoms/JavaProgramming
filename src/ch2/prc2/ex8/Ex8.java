package ch2.prc2.ex8;

import java.util.Scanner;

public class Ex8 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (x1,y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.print("�� (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		/*
		 * (x1,y1), (x2,y2)�� �̷���� ���簢���� ���ϴ� ��, �ٽ� Ǯ��
		 */
		
		int minX = 100, minY = 100;
		int maxX = 200, maxY = 200;

		boolean isInRect = false;
		isInRect = inRect(x1, y1, minX, minY, maxX, maxY);
		if (isInRect)
			System.out.println("(" + x1 + "," + y1 + ")�� �簢���� �浹�մϴ�.");
		else
			System.out.println("(" + x1 + "," + y1 + ")�� �簢���� �浹���� �ʽ��ϴ�.");

		isInRect = inRect(x2, y2, minX, minY, maxX, maxY);
		if (isInRect)
			System.out.println("(" + x2 + "," + y2 + ")�� �簢���� �浹�մϴ�.");
		else
			System.out.println("(" + x2 + "," + y2 + ")�� �簢���� �浹���� �ʽ��ϴ�.");

		sc.close();

	}

}

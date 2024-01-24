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
		
		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		/*
		 * (x1,y1), (x2,y2)로 이루어진 직사각형을 비교하는 것, 다시 풀기
		 */
		
		int minX = 100, minY = 100;
		int maxX = 200, maxY = 200;

		boolean isInRect = false;
		isInRect = inRect(x1, y1, minX, minY, maxX, maxY);
		if (isInRect)
			System.out.println("(" + x1 + "," + y1 + ")는 사각형과 충돌합니다.");
		else
			System.out.println("(" + x1 + "," + y1 + ")는 사각형과 충돌하지 않습니다.");

		isInRect = inRect(x2, y2, minX, minY, maxX, maxY);
		if (isInRect)
			System.out.println("(" + x2 + "," + y2 + ")는 사각형과 충돌합니다.");
		else
			System.out.println("(" + x2 + "," + y2 + ")는 사각형과 충돌하지 않습니다.");

		sc.close();

	}

}

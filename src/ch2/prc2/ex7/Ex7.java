package ch2.prc2.ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int minX = 100, minY = 100;
		int maxX = 200, maxY = 200;

		if ((x >= minX && x <= maxX) && (y >= minY && y <= maxY)) {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
		} else {
			System.out.println("(" + x + "," + y + ")는 사각형 밖에 있습니다.");
		}

		sc.close();

	}

}

package ch2.prc2.ex9;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력>>");
		int x0 = sc.nextInt();
		int y0 = sc.nextInt();
		double radius = sc.nextDouble();

		System.out.print("점 입력>>");
		double x = sc.nextInt();
		double y = sc.nextInt();

		double distance = Math.sqrt(Math.pow((x - x0), 2) + Math.pow((y - y0), 2));

		if (distance <= radius)
			System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + x + ", " + y + ")는 원 밖에 있다.");

		sc.close();

	}

}

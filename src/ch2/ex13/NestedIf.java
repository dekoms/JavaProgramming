package ch2.ex13;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();

		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();

		/*
		 * 큰 것부터 거르는 형태
		 * 60점 이상이면 합격, 미만이면 불합격
		 * 그 후 자세한 조건(4학년에 대한 추가 조건)
		 * 4학년에 대한 추가 조건이 더 까다로우므로, 4학년을 제외한 나머지를 먼저 해결하고 이후에 4학년을 해결함
		 */
		
		if (score >= 60) {
			if (year != 4)
				System.out.println("합격!");
			else if (score >= 70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		} else
			System.out.println("불합격!");

		scanner.close();

	}

}

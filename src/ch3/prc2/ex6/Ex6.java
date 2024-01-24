package ch3.prc2.ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.print("금액을 입력하시오>>");
		int price = sc.nextInt();

		// '/'연산으로 개수 구하고, '%='연산으로 나머지 계산
		for (int i = 0; i < unit.length; i++) {
			cnt[i] = price / unit[i];
			price %= unit[i];
		}

		for (int i = 0; i < unit.length; i++) {
			if (cnt[i] == 0)
				continue;
			System.out.println(unit[i] + "원 짜리 : " + cnt[i] + "개");
		}

		sc.close();

	}

}

package ch3.prc2.ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오>>");
		int num = sc.nextInt();
		// 행의 개수
		for (int i = 0; i < num; i++) {
			// 각 행마다 몇개의 열이 있는지 확인, 최대에서 최소로
			for (int j = num; i < j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}

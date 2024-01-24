package ch2.prc2.ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt();

		/*
		 * 중첩 if를 사용하며 &&효과를 냄
		 */
		
		if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.println("박수짝짝");
			} else {
				System.out.println("박수짝");
			}
		} else {
			System.out.println("없음");
		}

		sc.close();

	}

}

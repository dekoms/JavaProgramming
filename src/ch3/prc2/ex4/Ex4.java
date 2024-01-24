package ch3.prc2.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		// Scanner에는 문자를 입력받는 기능이 없다. 항상 문자열을 입력받아야 함!!!
		// char alpha = sc.next();
		String str = sc.next();
		char alpha = str.charAt(0);

		// 5줄만 맞추면 됨, 나머지는 안에 반복문에 맞춰서 유동적으로
		for (int i = alpha; i >= 97; i--) {
			// 항상 a부터 시작하니까 j=97 && j++ 고정, 최소에서 최대로
			for (int j = 97; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}

		sc.close();

	}

}

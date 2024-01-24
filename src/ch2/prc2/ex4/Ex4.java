package ch2.prc2.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		/*
		 * 알고리즘 개선
		 */
		
		int res = 0;
		if (num1 <= num2 && num1 >= num3) {
			res = num1;
		} else if (num1 <= num3 && num1 >= num2) {
			res = num1;
		} else if (num2 <= num1 && num2 >= num3) {
			res = num2;
		} else if (num2 <= num3 && num2 >= num1) {
			res = num2;
		} else if (num3 <= num1 && num3 >= num2) {
			res = num3;
		} else if (num3 <= num2 && num3 >= num1) {
			res = num3;
		}
		System.out.println("중간 값은 " + res);
		
		sc.close();

	}

}

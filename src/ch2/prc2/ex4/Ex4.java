package ch2.prc2.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� 3�� �Է�>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		/*
		 * �˰��� ����
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
		System.out.println("�߰� ���� " + res);
		
		sc.close();

	}

}

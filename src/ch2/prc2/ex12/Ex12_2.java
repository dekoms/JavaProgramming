package ch2.prc2.ex12;

import java.util.Scanner;

public class Ex12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����>>");
		double opr1 = sc.nextInt();
		String operator = sc.next();
		double opr2 = sc.nextInt();

		double res = 0.0;

		switch (operator) {
		case "+":
			res = opr1 + opr2;
			break;
		case "-":
			res = opr1 - opr2;
			break;
		case "*":
			res = opr1 * opr2;
			break;
		case "/":
			if (opr2 == 0.0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
			res = opr1 / opr2;
			break;
		}

		System.out.println(opr1 + operator + opr2 + "�� ��� ����� " + res);

		sc.close();

	}

}

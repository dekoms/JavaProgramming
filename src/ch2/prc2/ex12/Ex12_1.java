package ch2.prc2.ex12;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����>>");
		double opr1 = sc.nextDouble();
		String operator = sc.next();
		double opr2 = sc.nextDouble();

		double res = 0.0;

		if (operator.equals("+")) {
			res = opr1 + opr2;
		} else if (operator.equals("-")) {
			res = opr1 - opr2;
		} else if (operator.equals("*")) {
			res = opr1 * opr2;
		} else if (operator.equals("/")) {
			if (opr2 == 0.0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
			res = opr1 / opr2;
		}

		System.out.println(opr1 + operator + opr2 + "�� ��� ����� " + res);

		sc.close();

	}

}

package ch2.prc2.ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = sc.nextInt();

		double dollar = won / 1100;
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");

		sc.close();
		
	}

}

package ch3.prc2.ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		// ���� ����
		for (int i = 0; i < num; i++) {
			// �� �ึ�� ��� ���� �ִ��� Ȯ��, �ִ뿡�� �ּҷ�
			for (int j = num; i < j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}

package ch3.prc2.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		// Scanner���� ���ڸ� �Է¹޴� ����� ����. �׻� ���ڿ��� �Է¹޾ƾ� ��!!!
		// char alpha = sc.next();
		String str = sc.next();
		char alpha = str.charAt(0);

		// 5�ٸ� ���߸� ��, �������� �ȿ� �ݺ����� ���缭 ����������
		for (int i = alpha; i >= 97; i--) {
			// �׻� a���� �����ϴϱ� j=97 && j++ ����, �ּҿ��� �ִ��
			for (int j = 97; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}

		sc.close();

	}

}

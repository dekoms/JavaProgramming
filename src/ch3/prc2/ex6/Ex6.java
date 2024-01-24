package ch3.prc2.ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int price = sc.nextInt();

		// '/'�������� ���� ���ϰ�, '%='�������� ������ ���
		for (int i = 0; i < unit.length; i++) {
			cnt[i] = price / unit[i];
			price %= unit[i];
		}

		for (int i = 0; i < unit.length; i++) {
			if (cnt[i] == 0)
				continue;
			System.out.println(unit[i] + "�� ¥�� : " + cnt[i] + "��");
		}

		sc.close();

	}

}

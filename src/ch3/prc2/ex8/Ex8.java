package ch3.prc2.ex8;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �� ��?");
		int index = sc.nextInt();
		int[] arr = new int[index];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 100 + 1);
			for (int j = 0; j < i; j++) {
				if (random == arr[j]) {
					i--;
					break;
				}
			}
			// �ߺ��� ���� ��� �������� i--�� ���� �ٽ� ���� �ʱ�ȭ��
			arr[i] = random;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println();
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}

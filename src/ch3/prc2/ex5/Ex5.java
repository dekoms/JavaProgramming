package ch3.prc2.ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// �Է¹ް� ���ο� �迭�� ���� 3�� ����� �־ ����ϴ� ����� �õ��ߴ�...
		// �����δ� ���� �� �����غ���
		System.out.print("3�� ����� ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

		sc.close();

	}

}

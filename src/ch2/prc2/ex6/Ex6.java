package ch2.prc2.ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = sc.nextInt();

		/*
		 * ��ø if�� ����ϸ� &&ȿ���� ��
		 */
		
		if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.println("�ڼ�¦¦");
			} else {
				System.out.println("�ڼ�¦");
			}
		} else {
			System.out.println("����");
		}

		sc.close();

	}

}

package ch2.prc2.ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		/*
		 * Ex4�� �̾ �˰��� ����
		 */
		
		int res = 0;
		if (side1 <= side2 && side1 >= side3) {
			res = (side1 + side3 > side2) ? 1 : 0;
		} else if (side1 <= side3 && side1 >= side2) {
			res = (side1 + side2 > side3) ? 1 : 0;
		} else if (side2 <= side1 && side2 >= side3) {
			res = (side2 + side3 > side1) ? 1 : 0;
		} else if (side2 <= side3 && side2 >= side1) {
			res = (side1 + side2 > side3) ? 1 : 0;
		} else if (side3 <= side1 && side3 >= side2) {
			res = (side2 + side3 > side1) ? 1 : 0;
		} else if (side3 <= side2 && side3 >= side1) {
			res = (side1 + side3 > side2) ? 1 : 0;
		}

		if (res == 1) {
			System.out.println("�ﰢ���� �˴ϴ�");
		} else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}

		sc.close();

	}

}

package ch2.prc2.ex11;

import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = sc.nextInt();

		/*
		 * ���� ��³��� break;�� ���ְ� �����Ű��
		 */
		
		switch (month) {
		case 3:case 4:case 5:
			System.out.println("��");
			break;
		case 6:case 7:case 8:
			System.out.println("����");
			break;
		case 9:case 10:case 11:
			System.out.println("����");
			break;
		case 12:case 1:case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸��Է�");
			break;
		}

		sc.close();
		
	}

}

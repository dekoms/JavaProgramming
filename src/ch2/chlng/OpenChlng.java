package ch2.chlng;

import java.util.Scanner;

public class OpenChlng {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö�� >> ");
		String player1 = scanner.next();
		System.out.print("���� >> ");
		String player2 = scanner.next();

		/*
		 * �ϵ��ڵ��ε�..
		 * Solution
		 * ����, ����, ���� �� 1,0,2�� �����صΰ� �̸� ����Ͽ� ���ڸ� �����ϴ� ���??
		 * String winner = null;
		 */
		
		if(player1.equals(player2)) {
			System.out.println("�����ϴ�.");
		} else if(player1.equals("����")) {
			if(player2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else {
				System.out.println("���� �̰���ϴ�.");
			}
		} else if(player1.equals("����")) {
			if(player2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else {
				System.out.println("���� �̰���ϴ�.");
			}
		} else if(player1.equals("��")) {
			if(player2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else {
				System.out.println("���� �̰���ϴ�.");
			}
		}		
		
		scanner.close();

	}

}

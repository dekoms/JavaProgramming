package ch3.prc2.ex16;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = { "����", "����", "��" };

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��!>>");
			String user = sc.next();
			int com = (int) (Math.random() * 3);

			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}

			System.out.print("����� = " + user + ", ��ǻ�� = " + str[com] + ", ");

			if (user.equals(str[com])) {
				System.out.println("�����ϴ�.");
			} else if (user.equals("����")) {
				if (str[com].equals("��"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (str[com].equals("����"))
					System.out.println("����ڰ� �����ϴ�.");
			} else if (user.equals("����")) {
				if (str[com].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (str[com].equals("��"))
					System.out.println("����ڰ� �����ϴ�.");
			} else if (user.equals("��")) {
				if (str[com].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (str[com].equals("����"))
					System.out.println("����ڰ� �����ϴ�.");
			}

		}

		sc.close();

	}

}

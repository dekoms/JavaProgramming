package ch3.ex17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				//�� �ʿ��Ѱ���??
				//"���� �Է� ��Ʈ���� ���� �ִ� ��ū�� �����"�� �ǹ̸� �𸣰���
				//scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("���� " + sum);

		scanner.close();

	}

}

package ch3.prc2.ex15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
				continue;
			}
		}

		sc.close();

	}

}

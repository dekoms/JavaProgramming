package ch3.prc2.ex15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
				continue;
			}
		}

		sc.close();

	}

}

package ch7.prc2.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수(-1이 입력될 때까지)>> ");
		int input = 0;
		while (true) {
			if (input == -1)
				break;

			input = sc.nextInt();
			
		}

		
		sc.close();

	}

}

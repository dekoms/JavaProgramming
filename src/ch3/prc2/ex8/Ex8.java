package ch3.prc2.ex8;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 몇 개?");
		int index = sc.nextInt();
		int[] arr = new int[index];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 100 + 1);
			for (int j = 0; j < i; j++) {
				if (random == arr[j]) {
					i--;
					break;
				}
			}
			// 중복된 값이 잠깐 들어오더라도 i--를 통해 다시 값이 초기화됨
			arr[i] = random;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println();
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}

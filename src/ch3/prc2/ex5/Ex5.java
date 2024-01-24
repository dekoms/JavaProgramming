package ch3.prc2.ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 입력받고 새로운 배열을 만들어서 3의 배수만 넣어서 출력하는 방법을 시도했다...
		// 앞으로는 조금 더 생각해보자
		System.out.print("3의 배수는 ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

		sc.close();

	}

}

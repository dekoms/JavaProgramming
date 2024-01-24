package ch2.prc2.ex11;

import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();

		/*
		 * 같은 출력끼리 break;를 없애고 연결시키기
		 */
		
		switch (month) {
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
		case 9:case 10:case 11:
			System.out.println("가을");
			break;
		case 12:case 1:case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력");
			break;
		}

		sc.close();
		
	}

}

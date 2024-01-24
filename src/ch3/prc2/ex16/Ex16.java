package ch3.prc2.ex16;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = { "가위", "바위", "보" };

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!>>");
			String user = sc.next();
			int com = (int) (Math.random() * 3);

			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}

			System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[com] + ", ");

			if (user.equals(str[com])) {
				System.out.println("비겼습니다.");
			} else if (user.equals("가위")) {
				if (str[com].equals("보"))
					System.out.println("사용자가 이겼습니다.");
				else if (str[com].equals("바위"))
					System.out.println("사용자가 졌습니다.");
			} else if (user.equals("바위")) {
				if (str[com].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if (str[com].equals("보"))
					System.out.println("사용자가 졌습니다.");
			} else if (user.equals("보")) {
				if (str[com].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else if (str[com].equals("가위"))
					System.out.println("사용자가 졌습니다.");
			}

		}

		sc.close();

	}

}

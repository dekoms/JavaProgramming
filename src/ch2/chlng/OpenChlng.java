package ch2.chlng;

import java.util.Scanner;

public class OpenChlng {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String player1 = scanner.next();
		System.out.print("영희 >> ");
		String player2 = scanner.next();

		/*
		 * 하드코딩인데..
		 * Solution
		 * 가위, 바위, 보에 각 1,0,2를 대입해두고 이를 계산하여 승자를 결정하는 방법??
		 * String winner = null;
		 */
		
		if(player1.equals(player2)) {
			System.out.println("비겼습니다.");
		} else if(player1.equals("바위")) {
			if(player2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("영희가 이겼습니다.");
			}
		} else if(player1.equals("가위")) {
			if(player2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("영희가 이겼습니다.");
			}
		} else if(player1.equals("보")) {
			if(player2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("영희가 이겼습니다.");
			}
		}		
		
		scanner.close();

	}

}

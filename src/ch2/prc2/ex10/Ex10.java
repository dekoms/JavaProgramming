package ch2.prc2.ex10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int firstX0 = sc.nextInt();
		int firstY0 = sc.nextInt();
		int firstRadius = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int secondX0 = sc.nextInt();
		int secondY0 = sc.nextInt();
		int secondRadius = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow((secondX0 - firstX0), 2) + Math.pow((secondY0 - firstY0), 2));
		
		if(firstRadius+secondRadius>=distance) System.out.println("두 원은 서로 겹친다.");
		else System.out.println("두 원은 서로 겹치지 않는다.");
		
		sc.close();
		
	}

}

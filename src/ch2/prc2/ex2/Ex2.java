package ch2.prc2.ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = sc.nextInt();
		
		int tens = num/10;
		int ones = num%10;
		
		if(tens==ones) System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		
		sc.close();
		
	}

}

package ch2.prc2.ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = sc.nextInt();
		
		int tens = num/10;
		int ones = num%10;
		
		if(tens==ones) System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		
		sc.close();
		
	}

}

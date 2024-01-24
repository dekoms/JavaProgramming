package ch2.prc2.ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int price = sc.nextInt();
		
		/*
		 * 알고리즘 개선, 배열을 이용
		 */
		
		int fiftyThousand = price/50000;
		int tenThousand = price%50000/10000;
		int thousand = price%50000%10000/1000;
		int hundred = price%50000%10000%1000/100;
		int fifty = price%50000%10000%1000%100/50;
		int ten = price%50000%10000%1000%100%50/10;
		int one = price%50000%10000%1000%100%50%10;
		
		System.out.println("오만원권 "+fiftyThousand+"매");
		System.out.println("만원권 "+tenThousand+"매");
		System.out.println("천원권 "+thousand+"매");
		System.out.println("백원 "+hundred+"개");
		System.out.println("오십원 "+fifty+"개");
		System.out.println("십원 "+ten+"개");
		System.out.println("일원 "+one+"개");
		
		sc.close();

	}

}

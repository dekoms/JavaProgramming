package ch2.prc2.ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int price = sc.nextInt();
		
		/*
		 * �˰��� ����, �迭�� �̿�
		 */
		
		int fiftyThousand = price/50000;
		int tenThousand = price%50000/10000;
		int thousand = price%50000%10000/1000;
		int hundred = price%50000%10000%1000/100;
		int fifty = price%50000%10000%1000%100/50;
		int ten = price%50000%10000%1000%100%50/10;
		int one = price%50000%10000%1000%100%50%10;
		
		System.out.println("�������� "+fiftyThousand+"��");
		System.out.println("������ "+tenThousand+"��");
		System.out.println("õ���� "+thousand+"��");
		System.out.println("��� "+hundred+"��");
		System.out.println("���ʿ� "+fifty+"��");
		System.out.println("�ʿ� "+ten+"��");
		System.out.println("�Ͽ� "+one+"��");
		
		sc.close();

	}

}

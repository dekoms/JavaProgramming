package ch7.prc2.ex3;

import java.util.Scanner;
import java.util.Vector;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<>();
		
		int input = -1;
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}
			
			int sum = 0;
			v.add(input);
			for(Integer i : v) {
				System.out.print(i + " ");
				sum += i;
			}
			System.out.println();
			System.out.println("���� ���: " + sum / v.size());
		}

		sc.close();

	}

}

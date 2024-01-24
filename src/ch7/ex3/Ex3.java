package ch7.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Character> list = new ArrayList<Character>();

		System.out.print("6과목의 학점은? ");
		for (int i = 0; i < 6; i++) {
			char grade = sc.next().charAt(0);
			list.add(Character.valueOf(grade));
		}

		double sum = 0.0;
		for (Character i : list) {
			switch ((char) i) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		System.out.println(sum / 6);

		sc.close();

	}

}

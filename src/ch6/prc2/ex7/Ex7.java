package ch6.prc2.ex7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			if (line.equals("�׸�"))
				break;
			StringTokenizer st = new StringTokenizer(line, " ");
			System.out.println("���� ������ " + st.countTokens());

//			String[] str = line.split(" ");
//			System.out.println("���� ������ " + str.length);

		}

		sc.close();

	}

}

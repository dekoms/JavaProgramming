package ch6.prc2.ex7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			if (line.equals("그만"))
				break;
			StringTokenizer st = new StringTokenizer(line, " ");
			System.out.println("어절 개수는 " + st.countTokens());

//			String[] str = line.split(" ");
//			System.out.println("어절 개수는 " + str.length);

		}

		sc.close();

	}

}

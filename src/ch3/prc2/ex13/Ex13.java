package ch3.prc2.ex13;

public class Ex13 {

	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9) && (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
				System.out.println(i + " ¹Ú¼ö Â¦Â¦");
			} else if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9) || (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
				System.out.println(i + " ¹Ú¼ö Â¦");
			}
		}

	}

}

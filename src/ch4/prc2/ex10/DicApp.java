package ch4.prc2.ex10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	// 리턴 타입 String인 함수 어떻게 사용함???
	// static 함수를 굳이 쓰는 이유???
	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			}
		}

		return null;
	}
}

public class DicApp {

	public void search(Scanner sc) {
		String word, print;
		while (true) {
			System.out.print("한글 단어?");
			word = sc.next();

			if (word.equals("그만"))
				return;

			print = Dictionary.kor2Eng(word);
			if (print == null) {
				System.out.println(word + "는 저의 사전에 없습니다.");
				continue;
			}
			System.out.println(word + "은 " + print);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("한영 단어 검색 프로그램입니다.");

		search(sc);
		sc.close();
	}

	public static void main(String[] args) {
		DicApp app = new DicApp();
		app.run();

	}

}

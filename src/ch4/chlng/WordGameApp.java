package ch4.chlng;

import java.util.Scanner;

class Player {
	private String name;

	public Player() {
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getWordFromUser(Scanner sc) {
		System.out.print(name + ">>");
		String word = sc.next();

		return word;
	}

	public int checkSuccess(String word, String previousWord) {
		char lastChar = previousWord.charAt(previousWord.length() - 1);
		char firstChar = word.charAt(0);

		if (lastChar == firstChar) {
			return 1;
		}

		return 0;
	}
}

public class WordGameApp {
	private int people;
	private String previousWord;

	public WordGameApp(int people) {
		this.people = people;
		this.previousWord = "아버지";
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		Player[] player = new Player[people];
		for (int i = 0; i < player.length; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = sc.next();
			player[i] = new Player(name);
		}

		System.out.println("시작하는 단어는 아버지입니다");

		int cnt = 0;
		String word = null;
		while (true) {
			if (cnt >= player.length)
				cnt = 0;

			word = player[cnt].getWordFromUser(sc);
			if (player[cnt].checkSuccess(word, previousWord) == 0) {
				System.out.println(player[cnt].getName() + "이 졌습니다.");
				break;
			}

			previousWord = word;
			cnt++;
		}

		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int people = sc.nextInt();

		WordGameApp app = new WordGameApp(people);
		app.run();

		sc.close();

	}

}

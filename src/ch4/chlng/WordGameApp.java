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
		this.previousWord = "�ƹ���";
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		Player[] player = new Player[people];
		for (int i = 0; i < player.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = sc.next();
			player[i] = new Player(name);
		}

		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");

		int cnt = 0;
		String word = null;
		while (true) {
			if (cnt >= player.length)
				cnt = 0;

			word = player[cnt].getWordFromUser(sc);
			if (player[cnt].checkSuccess(word, previousWord) == 0) {
				System.out.println(player[cnt].getName() + "�� �����ϴ�.");
				break;
			}

			previousWord = word;
			cnt++;
		}

		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int people = sc.nextInt();

		WordGameApp app = new WordGameApp(people);
		app.run();

		sc.close();

	}

}

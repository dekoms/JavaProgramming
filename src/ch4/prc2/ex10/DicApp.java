package ch4.prc2.ex10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	// ���� Ÿ�� String�� �Լ� ��� �����???
	// static �Լ��� ���� ���� ����???
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
			System.out.print("�ѱ� �ܾ�?");
			word = sc.next();

			if (word.equals("�׸�"))
				return;

			print = Dictionary.kor2Eng(word);
			if (print == null) {
				System.out.println(word + "�� ���� ������ �����ϴ�.");
				continue;
			}
			System.out.println(word + "�� " + print);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

		search(sc);
		sc.close();
	}

	public static void main(String[] args) {
		DicApp app = new DicApp();
		app.run();

	}

}

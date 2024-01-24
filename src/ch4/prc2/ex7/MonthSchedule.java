package ch4.prc2.ex7;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule {
	private int day;
	private String todo;

	public MonthSchedule() {
	}

	public MonthSchedule(int day) {
		this.day = day;
	}

	public void input(int date, Scanner sc, Day[] schedule) {
		System.out.print("����(��ĭ�����Է�)?");
		todo = sc.next();

		schedule[date - 1].set(todo);

		return;
	}

	public void view(int date, Scanner s, Day[] schedule) {
		if (schedule[date - 1].get() == null) {
			schedule[date - 1].show();
		} else {
			System.out.print(date + "���� �� ���� ");
			schedule[date - 1].show();
		}

		return;
	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);

		return;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		Day[] schedule = new Day[day];
		for (int i = 0; i < schedule.length; i++) {
			schedule[i] = new Day();
		}

		System.out.println("�̹��� ������ ���� ���α׷�.");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int start = sc.nextInt();

			if (start == 3) {
				sc.close();
				finish();
			}

			System.out.print("��¥(1~" + day + ")" + "?");
			int date = sc.nextInt();

			if (start == 1) {
				input(date, sc, schedule);
				System.out.println();
			} else if (start == 2) {
				view(date, sc, schedule);
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		
	}

}

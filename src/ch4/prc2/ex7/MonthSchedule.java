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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
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
		System.out.print("할일(빈칸없이입력)?");
		todo = sc.next();

		schedule[date - 1].set(todo);

		return;
	}

	public void view(int date, Scanner s, Day[] schedule) {
		if (schedule[date - 1].get() == null) {
			schedule[date - 1].show();
		} else {
			System.out.print(date + "일의 할 일은 ");
			schedule[date - 1].show();
		}

		return;
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

		return;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		Day[] schedule = new Day[day];
		for (int i = 0; i < schedule.length; i++) {
			schedule[i] = new Day();
		}

		System.out.println("이번달 스케쥴 관리 프로그램.");
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int start = sc.nextInt();

			if (start == 3) {
				sc.close();
				finish();
			}

			System.out.print("날짜(1~" + day + ")" + "?");
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

package ch4.prc2.ex12;

import java.util.Scanner;

//클래스 배열 생성
//S, A, B 3가지 원소를 가지는 Seat 클래스 객체 배열
class Seat {
	private String type;
	private String status;

	Seat() {
		this.type = null;
		this.status = "--- --- --- --- --- --- --- --- --- ---";
	}

	public void setType(int i) {
		if (i == 0) {
			this.type = "S";
		} else if (i == 1) {
			this.type = "A";
		} else if (i == 2) {
			this.type = "B";
		}
	}

	public void printCurrentStatus() {
		System.out.println(type + ">> " + status);
	}

	public void updateStatus(String[] currentNames) {
		status = "";
		for (int i = 0; i < currentNames.length; i++) {
			status += currentNames[i] + " ";
		}

		String updatedStatus = status.substring(0, 39);
		status = updatedStatus;
	}

	public void insertName(String name, int number) {
		String[] currentNames = status.split(" ");
		currentNames[number - 1] = name;

		updateStatus(currentNames);
	}

	public void deleteName(String name) {
		String[] currentNames = status.split(" ");

		boolean isExist = false;

		int index = -1;
		for (int i = 0; i < currentNames.length; i++) {
			if (currentNames[i].equals(name)) {
				index = i;
				isExist = true;
			}
		}

		if (!isExist) {
			System.out.println("다시 입력하세요");
			return;
		}

		currentNames[index] = "---";

		updateStatus(currentNames);
	}

}

public class Ex12 {

	public void book(Scanner sc, Seat[] seat) {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int input = sc.nextInt();
		seat[input - 1].printCurrentStatus();

		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int number = sc.nextInt();

		seat[input - 1].insertName(name, number);
	}

	public void view(Seat[] seat) {
		for (int i = 0; i < seat.length; i++) {
			seat[i].printCurrentStatus();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	public void cancel(Scanner sc, Seat[] seat) {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int input = sc.nextInt();
		seat[input - 1].printCurrentStatus();

		System.out.print("이름>>");
		String name = sc.next();
		seat[input - 1].deleteName(name);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("명품콘서트홀 예약 시스템입니다.");

		Seat[] seat = new Seat[3];
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat();
			seat[i].setType(i);
		}

		int input = -1;
		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			input = sc.nextInt();
			switch (input) {
			case 4:
				sc.close();
				System.exit(0);
			case 1:
				book(sc, seat);
				break;
			case 2:
				view(seat);
				break;
			case 3:
				cancel(sc, seat);
				break;
			}

		}
	}

	public static void main(String[] args) {
		Ex12 ex12 = new Ex12();
		ex12.run();

	}

}

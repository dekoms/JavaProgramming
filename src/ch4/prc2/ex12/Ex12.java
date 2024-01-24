package ch4.prc2.ex12;

import java.util.Scanner;

//Ŭ���� �迭 ����
//S, A, B 3���� ���Ҹ� ������ Seat Ŭ���� ��ü �迭
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
			System.out.println("�ٽ� �Է��ϼ���");
			return;
		}

		currentNames[index] = "---";

		updateStatus(currentNames);
	}

}

public class Ex12 {

	public void book(Scanner sc, Seat[] seat) {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int input = sc.nextInt();
		seat[input - 1].printCurrentStatus();

		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int number = sc.nextInt();

		seat[input - 1].insertName(name, number);
	}

	public void view(Seat[] seat) {
		for (int i = 0; i < seat.length; i++) {
			seat[i].printCurrentStatus();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}

	public void cancel(Scanner sc, Seat[] seat) {
		System.out.print("�¼� S:1, A:2, B:3>>");
		int input = sc.nextInt();
		seat[input - 1].printCurrentStatus();

		System.out.print("�̸�>>");
		String name = sc.next();
		seat[input - 1].deleteName(name);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");

		Seat[] seat = new Seat[3];
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat();
			seat[i].setType(i);
		}

		int input = -1;
		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
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

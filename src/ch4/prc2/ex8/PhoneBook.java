package ch4.prc2.ex8;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

}

public class PhoneBook {
	private int people;
	private boolean isExist;

	PhoneBook() {
		this.people = -1;
		this.isExist = false;
	}

	//�ݺ��� �ȿ� ���� �����ϴ°� ��������???
	public void search(Phone[] phone, Scanner sc) {
		String searchName = null;
		while (true) {
			System.out.print("�˻��� �̸�>>");
			searchName = sc.next();

			if (searchName.equals("�׸�"))
				return;

			for (int i = 0; i < phone.length; i++) {
				if (searchName.equals(phone[i].getName())) {
					System.out.println(searchName + "�� ��ȣ�� " + phone[i].getTel() + " �Դϴ�.");
					isExist = true;
				}
			}

			if (!isExist) {
				System.out.println(searchName + " �� �����ϴ�.");
			}

		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο���>>");
		people = sc.nextInt();

		Phone[] phone = new Phone[people];
		for (int i = 0; i < phone.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");

		search(phone, sc);
		sc.close();

	}

	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.run();

	}

}

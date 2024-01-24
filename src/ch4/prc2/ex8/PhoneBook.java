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

	//반복문 안에 변수 선언하는게 나으려나???
	public void search(Phone[] phone, Scanner sc) {
		String searchName = null;
		while (true) {
			System.out.print("검색할 이름>>");
			searchName = sc.next();

			if (searchName.equals("그만"))
				return;

			for (int i = 0; i < phone.length; i++) {
				if (searchName.equals(phone[i].getName())) {
					System.out.println(searchName + "의 번호는 " + phone[i].getTel() + " 입니다.");
					isExist = true;
				}
			}

			if (!isExist) {
				System.out.println(searchName + " 이 없습니다.");
			}

		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.print("인원수>>");
		people = sc.nextInt();

		Phone[] phone = new Phone[people];
		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");

		search(phone, sc);
		sc.close();

	}

	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.run();

	}

}

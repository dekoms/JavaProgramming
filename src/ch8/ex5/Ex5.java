package ch8.ex5;

import java.io.*;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			File f = new File("c:\\Temp\\phone.txt");
			fw = new FileWriter(f);

			Scanner sc = new Scanner(System.in);
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = sc.nextLine();
				if (line.equals("�׸�")) {
					break;
				}
				fw.write(line + "\r\n");
			}

			System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");

			sc.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

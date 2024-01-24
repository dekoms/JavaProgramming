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
			System.out.println("전화번호 입력 프로그램입니다.");
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine();
				if (line.equals("그만")) {
					break;
				}
				fw.write(line + "\r\n");
			}

			System.out.println(f.getPath() + "에 저장하였습니다.");

			sc.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

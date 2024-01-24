package ch8.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		int b[] = { 7, 51, 3, 4, -1, 24 };
		String filename = "c://Temp/test.dat";

		try {
			FileOutputStream out = new FileOutputStream(filename);
			FileInputStream file = new FileInputStream(filename);

			for (int i = 0; i < b.length; i++) {
				out.write(b[i]);
				System.out.print(b[i] + " ");
			}
			System.out.println();

			out.close();
			file.close();
		} catch (IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		System.out.println(filename + "�� �����Ͽ����ϴ�.");

	}

}

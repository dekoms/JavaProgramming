package ch8.ex4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		String filename = "c://Temp/test.txt";
		int c;
		try {
			FileInputStream file = new FileInputStream(filename);
			while ((c = file.read()) != -1) {
				System.out.print((char) c);
			}
			System.out.println("\n");
			file.close();

			FileReader fd = new FileReader(filename);
			while ((c = fd.read()) != -1) {
				System.out.print((char) c);
			}
			fd.close();

		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}

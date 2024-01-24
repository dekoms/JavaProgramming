package ch8.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		try {
			String filename = "c://Temp/file.dat";
			FileOutputStream out = new FileOutputStream(filename);
			FileInputStream file = new FileInputStream(filename);

			for (byte i = 1; i <= 10; i++) {
				out.write(i);
			}

			int c;
			while ((c = file.read()) != -1) {
				System.out.print(c + " ");
			}

			out.close();
			file.close();
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}

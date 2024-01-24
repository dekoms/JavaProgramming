package ch8.ex1;

import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		try {
			FileReader fd = new FileReader("C:\\Temp\\gadana.txt");

			int c;
			while ((c = fd.read()) != -1) {
				System.out.print((char) c);
			}

			fd.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}

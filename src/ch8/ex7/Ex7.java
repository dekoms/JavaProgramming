package ch8.ex7;

import java.io.FileReader;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:\\Temp\\phone.txt");

			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}

			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

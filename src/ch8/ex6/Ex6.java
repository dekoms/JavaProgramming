package ch8.ex6;

import java.io.*;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			FileReader fr = new FileReader("c:\\Temp\\phone.txt");
			br = new BufferedReader(fr);

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}

			fr.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

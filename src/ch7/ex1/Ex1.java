package ch7.ex1;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		Integer three = 0;
		for (int i = 0; i < 5; i++) {
			list.add(three);
			three += 3;
		}

		for (Integer i : list) {
			System.out.println(i);
		}
		
	}

}

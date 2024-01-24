package ch7.ex2;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	private String name;
	private int first;
	private int second;

	public Student(String name, int first, int second) {
		this.name = name;
		this.first = first;
		this.second = second;
	}

	public void printName() {
		System.out.println(name);
	}
}

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("ÀÚ¹Ù¿Õ", 1, 1));
		list.add(new Student("ÀÚ¹ÙÂ¯", 1, 1));
		list.add(new Student("È«±æµ¿", 1, 1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			it.next().printName();
		}
		
	}

}

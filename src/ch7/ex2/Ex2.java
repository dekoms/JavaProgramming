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
		list.add(new Student("�ڹٿ�", 1, 1));
		list.add(new Student("�ڹ�¯", 1, 1));
		list.add(new Student("ȫ�浿", 1, 1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			it.next().printName();
		}
		
	}

}

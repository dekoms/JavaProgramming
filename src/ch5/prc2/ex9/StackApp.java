package ch5.prc2.ex9;

import java.util.Scanner;

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}

class StringStack implements Stack {
	private int size;
	private int top = -1;
	private String[] stack;

	public StringStack(int size) {
		this.size = size;
		stack = new String[size];
	}

	@Override
	public int length() {
		return top + 1;
	}

	@Override
	public int capacity() {
		return size;
	}

	@Override
	public String pop() {
		if (top == -1) {
			return null;
		}
		return stack[top--];
	}

	@Override
	public boolean push(String val) {
		if (top + 1 == size) {
			return false;
		}
		stack[++top] = val;
		return true;
	}
}

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = sc.nextInt();

		StringStack stack = new StringStack(size);

		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = sc.next();
			if (str.equals("�׸�")) {
				break;
			}

			boolean temp = stack.push(str);
			if (!temp)
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}

		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for (int i = 0, j= stack.length(); i < j; i++) {
			System.out.print(stack.pop() + " ");
		}

		sc.close();

	}

}

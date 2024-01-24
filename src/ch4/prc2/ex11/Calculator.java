package ch4.prc2.ex11;

import java.util.Scanner;

class Add {
	private int a;
	private int b;

	public void setValue(int opr1, int opr2) {
		a = opr1;
		b = opr2;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub {
	private int a;
	private int b;

	public void setValue(int opr1, int opr2) {
		a = opr1;
		b = opr2;
	}

	public int calculate() {
		return a - b;
	}
}

class Mul {
	private int a;
	private int b;

	public void setValue(int opr1, int opr2) {
		a = opr1;
		b = opr2;
	}

	public int calculate() {
		return a * b;
	}
}

class Div {
	private int a;
	private int b;

	public void setValue(int opr1, int opr2) {
		a = opr1;
		b = opr2;
	}

	public int calculate() {
		return a / b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오>>");
		int opr1 = sc.nextInt();
		int opr2 = sc.nextInt();
		String toChar = sc.next();
		char operator = toChar.charAt(0);

		switch (operator) {
		case '+':
			Add add = new Add();
			add.setValue(opr1, opr2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(opr1, opr2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(opr1, opr2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(opr1, opr2);
			System.out.println(div.calculate());
			break;
		}

		sc.close();

	}

}

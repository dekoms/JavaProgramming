package ch3.prc2.ex7;

public class Ex7 {

	public static void main(String[] args) {
		int[] num = new int[10];
		double sum = 0.0;

		// �Է��� ��� for�� �ϳ��� �ذ� ������ ���� (Ex5�� ���غ���)
		System.out.print("������ ������ : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			sum += num[i];
			System.out.print(num[i] + " ");
		}
		System.out.println();

		System.out.println("����� " + sum / num.length);

	}

}

package ch3.prc2.ex10;

public class Ex10 {

	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int cnt = 0;

		//�� ����� �ƹ��� ���� �տ� ���� ���� 0�� �ƴ� Ȯ���� ������ ������...
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				int random = (int) (Math.random() * 10 + 1);
				for (int j = 0; j < arr[i].length; j++) {
					if (cnt >= 10)
						break;
					int isInsert = (int) (Math.random() * 2 + 1);
					if (isInsert % 2 == 0) {
						arr[i][j] = random;
						cnt++;
					}
				}
			}
			if (cnt == 10)
				break;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

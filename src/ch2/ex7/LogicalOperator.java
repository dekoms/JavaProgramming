package ch2.ex7;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));

		System.out.println((3 > 2) && (3 > 4));
		//Dead code: �ʿ䰡 ���� �ڵ�, �ߺ��Ǵ� �ڵ�, ������ �ʴ� �ڵ� ���� ����
		//�׻� true�̱� ������ (-1 > 0)�� �ʿ䰡 ����
		//System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));

	}

}

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
		//Dead code: 필요가 없는 코드, 중복되는 코드, 사용되지 않는 코드 등을 말함
		//항상 true이기 때문에 (-1 > 0)은 필요가 없음
		//System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));

	}

}

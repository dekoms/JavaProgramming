package ch3.prc2.ex7;

public class Ex7 {

	public static void main(String[] args) {
		int[] num = new int[10];
		double sum = 0.0;

		// 입력이 없어서 for문 하나로 해결 가능한 것임 (Ex5과 비교해보자)
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			sum += num[i];
			System.out.print(num[i] + " ");
		}
		System.out.println();

		System.out.println("평균은 " + sum / num.length);

	}

}

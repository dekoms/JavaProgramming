package ch3.chlng;

import java.util.Random;
import java.util.Scanner;

public class OpenChlng {

	static int randomCard() {
		Random r = new Random();
		int randomNum = r.nextInt(100);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");

		return randomNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int card;
		int k = randomCard();

		int cnt = 1;
		int min = 0, max = 99;
		while (true) {
			System.out.println(min + "-" + max);
			System.out.print(cnt + ">>");
			card = sc.nextInt();
			
			if (card == k) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String text = sc.next();
				if (text.equals("n")) {
					break;
				} else if(text.equals("y")){
					k = randomCard();
					min = 0;
					max = 99;
					cnt = 1;
					continue;
				} else {
					//이거 좀 더 깔끔하게 못하려나???
					System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
					System.exit(0);
				}
			} else if (card < k) {
				System.out.println("더 높게");
				min = card + 1;
			} else {
				System.out.println("더 낮게");
				max = card - 1;
			}
			cnt++;
		}

		sc.close();

	}

}

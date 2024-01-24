package ch3.chlng;

import java.util.Random;
import java.util.Scanner;

public class OpenChlng {

	static int randomCard() {
		Random r = new Random();
		int randomNum = r.nextInt(100);
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");

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
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
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
					//�̰� �� �� ����ϰ� ���Ϸ���???
					System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
					System.exit(0);
				}
			} else if (card < k) {
				System.out.println("�� ����");
				min = card + 1;
			} else {
				System.out.println("�� ����");
				max = card - 1;
			}
			cnt++;
		}

		sc.close();

	}

}

package ch3.prc2.ex14;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] course = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int[] score = { 95, 88, 76, 62, 55 };
		boolean isExist = false;

		while (true) {
			System.out.print("���� �̸�>>");
			String name=sc.next();
			
			if(name.equals("�׸�")) 
				break;
			
			for(int i=0;i<course.length;i++) {
				if(name.equals(course[i])){
					System.out.println(course[i]+"�� ������ "+score[i]);
					isExist = true;
				}
			}
			//�̰� ���� �ٸ� ����� ��������...
			if(!isExist) {
				System.out.println("���� �����Դϴ�.");
			}
			
			isExist=false;
		}

		sc.close();
		
	}

}

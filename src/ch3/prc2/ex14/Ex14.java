package ch3.prc2.ex14;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };
		boolean isExist = false;

		while (true) {
			System.out.print("과목 이름>>");
			String name=sc.next();
			
			if(name.equals("그만")) 
				break;
			
			for(int i=0;i<course.length;i++) {
				if(name.equals(course[i])){
					System.out.println(course[i]+"의 점수는 "+score[i]);
					isExist = true;
				}
			}
			//이거 말고 다른 방법은 없으려나...
			if(!isExist) {
				System.out.println("없는 과목입니다.");
			}
			
			isExist=false;
		}

		sc.close();
		
	}

}

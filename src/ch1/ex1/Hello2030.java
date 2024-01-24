package ch1.ex1;

public class Hello2030 {

	static class C{
		public void main() {
			System.out.println("static으로 class 컴파일 미리 시켜두기");
		}
	}
	
	public static void main(String[] args) {
		int n = 2030;
		System.out.println("헬로" + n);
		
		C c = new C();
		c.main();
		
	}

}

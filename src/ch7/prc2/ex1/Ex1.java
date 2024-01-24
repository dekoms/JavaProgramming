package ch7.prc2.ex1;

class Box<T>{
	T content;
	
	void set(T item) {
		content = item;
	}
	
	T get() {
		return content;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("안녕하세요!");
		System.out.println("문자열: " + box1.get());
		
		Box<Integer> box2 = new Box<>();
		box2.set(10);
		System.out.println("정수: " + box2.get());
		
		Box<Double> box3 = new Box<>();
		box3.set(3.14);
		System.out.println("소수: " + box3.get());
		
	}

}

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
		box1.set("�ȳ��ϼ���!");
		System.out.println("���ڿ�: " + box1.get());
		
		Box<Integer> box2 = new Box<>();
		box2.set(10);
		System.out.println("����: " + box2.get());
		
		Box<Double> box3 = new Box<>();
		box3.set(3.14);
		System.out.println("�Ҽ�: " + box3.get());
		
	}

}

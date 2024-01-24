package ch7.prc2.ex2;

class Pair<T, K> {
	private T integer;
	private K string;

	public Pair(T integer, K string) {
		this.integer = integer;
		this.string = string;
	}
	
	void setInteger(T integer) {
		this.integer = integer;
	}
	
	void setString(K string) {
		this.string = string;
	}
	
	T getInteger() {
		return integer;
	}
	
	K getString() {
		return string;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair<>(10, "Hello");
		System.out.println(pair.getInteger());
		System.out.println(pair.getString());
		
		pair.setInteger(20);
		pair.setString("ByeBye");
		System.out.println(pair.getInteger());
		System.out.println(pair.getString());
		
	}

}

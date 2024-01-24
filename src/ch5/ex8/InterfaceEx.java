package ch5.ex8;

interface PhoneInterface {
	final int TIMEOUT = 10000;

	void senCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {

	@Override
	public void senCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.senCall();
		phone.receiveCall();
		phone.flash();

	}

}

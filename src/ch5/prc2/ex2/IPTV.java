package ch5.prc2.ex2;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}

}

public class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	@Override
	public void printProperty() {
		System.out.println("���� IPTV�� " + address + " �ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}
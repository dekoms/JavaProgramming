package ch5.prc2.ex10;

import java.util.Arrays;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	private int size;

	//Arrays.fill�� �迭�� ���� ""�� �ʱ�ȭ ������ ������ keyArray[i].equals(key)���� ���� �߻���
	//�ٸ� �ذ� ����� ����???
	public Dictionary(int size) {
		this.size = size;
		keyArray = new String[size];
		Arrays.fill(keyArray, "");
		valueArray = new String[size];
		Arrays.fill(valueArray, "");
	}

	@Override
	String get(String key) {
		for (int i = 0; i < length(); i++) {
			if (keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < size; i++) {
			if (keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}

		for (int i = 0; i < size; i++) {
			if (keyArray[i].equals("")) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
	}

	@Override
	String delete(String key) {
		String temp;
		for (int i = 0; i < length(); i++) {
			if (keyArray[i].equals(key)) {
				temp = valueArray[i];
				keyArray[i] = valueArray[i] = "";
				return temp;
			}
		}
		return null;
	}

	@Override
	int length() {
		return keyArray.length;
	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));

	}
}

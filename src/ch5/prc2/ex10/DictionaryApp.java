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

	//Arrays.fill로 배열의 값을 ""로 초기화 해주지 않으면 keyArray[i].equals(key)에서 오류 발생함
	//다른 해결 방법은 없나???
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));

	}
}

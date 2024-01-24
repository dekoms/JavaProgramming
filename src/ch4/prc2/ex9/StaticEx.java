package ch4.prc2.ex9;

class ArrayUtil {
	//더 나은 알고리즘??
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int idxA = 0;
		int idxB = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < a.length)
				c[i] = a[idxA++];
			else
				c[i] = b[idxB++];
		}
		
		return c;
	}

	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}
}

public class StaticEx {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}

package by.http.alltask;

public class DecompArray02 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {

		int[] a = { 2, 6, 4, 9 };

		System.out.println(method(a));

	}

	public static int method(int[] a) {

		int value = 0;
		for (int i = 0; i < a.length; i++) {

			value = nod(a[0], a[1]);
			value = nod(value, a[i]);
		}
		return value;

	}

	private static int nod(int a, int b) {

		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		return a + b;
	}

}

package by.http.alltask;

public class DecompArray06 {

	/*
	 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	 * простыми.
	 */

	public static void main(String[] args) {

		int[] a = { 1, 2, 4 };

		es(a);

	}

	public static void es(int[] a) {

		int value = 0;
		for (int i = 0; i < a.length; i++) {

			value = nod(a[0], a[1]);
			if (value == 1) {
				System.out.println("Взаимно простые");
				break;
			}
			value = nod(value, a[i]);
			if (value == 1) {
				System.out.println("Взаимно простые");
			} else {
				System.out.println("Не взаимно простые");
				break;
			}
		}

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

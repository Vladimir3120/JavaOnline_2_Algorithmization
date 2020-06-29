package by.http.alltask;

public class DecompArray12 {

	/*
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	 * элементами которого являются числа, сумма цифр которых равна К и которые не
	 * большее N.
	 */

	public static void main(String[] args) {

		int k = 8;
		int m = 2542;

		int[] a = new int[m];

		arr(a(a), k, m);

	}

	public static int[] a(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = 1 + i;

		}
		return a;

	}

	public static void arr(int[] a, int k, int m) {

		int g = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < a.length) {

				g = a[i] % 10;

				int count = y(m) - 1;
				int x = 10;
				while (count > 0) {

					g += a[i] / x % 10;

					count--;
					x *= 10;
				}

				if (g == k) {
					System.out.print(a[i] + " ");
				}
			}

		}
	}

	public static int y(int m) {

		int y = 0;

		while (m > 0) {

			int x = m % 10;
			m /= 10;
			y++;
		}

		return y;

	}
}

package by.http.alltask;

public class DecompArray14 {

	/*
	 * 14. Натуральное число, в записи которого n цифр, называется числом
	 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
	 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать
	 * декомпозицию.
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
		System.out.print("Числа Армстрогана от K до M: >>  ");
		int g = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < a.length) {

				g = (int) Math.pow(a[i] % 10, 3);

				int count = y(m) - 1;
				int x = 10;
				while (count > 0) {

					g += Math.pow(a[i] / x % 10, 3);

					count--;
					x *= 10;
				}
				if (g == a[i]) {
					System.out.print(g + "; ");
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

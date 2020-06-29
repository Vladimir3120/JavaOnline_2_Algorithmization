package by.http.alltask;

public class DecompArray17 {

	/*
	 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
	 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для
	 * решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int n = 123456;
		// System.out.println(n);

		sumIter(s(n), n);

	}

	private static int sumIter(int s, int n) {
		int a = 0;
		int count = 0;
		a = n - s;
		// System.out.println(a);

		while (a != 0) {
			a -= s(a);
			// System.out.println(a + " ");
			count++;
		}
		System.out.print("Колличество действий = ");
		return out(count);

	}

	private static int s(int n) {

		int s = 0;
		int c = 1;
		int g = 0;
		int count = 0;

		while (count < y(n)) {

			g = n / c % 10;

			s += g;

			c *= 10;
			count++;
		}

		// System.out.println(s);
		return s;

	}

	public static int y(int n) {

		int y = 0;

		while (n > 0) {

			int x = n % 10;
			n /= 10;
			y++;
		}

		return y;

	}

	private static int out(int x) {

		System.out.println(x);

		return x;

	}

}
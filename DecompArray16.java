package by.http.alltask;

public class DecompArray16 {

	/*
	 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих
	 * только нечетные цифры. Определить также, сколько четных цифр в найденной
	 * сумме. Для решения задачи использовать декомпозицию
	 */

	public static void main(String[] args) {

		int n = 1000;

		sumPositive(sum(a(n), n));

	}

	public static int[] a(int n) {

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {

			a[i] = i + 1;

		}
		return a;

	}

	private static int sum(int[] a, int n) {
		int sum = 0;

		int g = 0;
		for (int i = 0; i < a.length; i++) {

			int b = 1;
			int c = 1;

			int count = 0;
			while (count < y(n)) {

				g = a[i] / c % 10;

				if (g % 2 != 0) {
					b++;

					if (a[i] < 10 && g % 2 != 0) {
						// System.out.print(a[i]);
						sum += a[i];
					}
					if (b == 3 && a[i] < 1000) {
						// System.out.print(a[i]);
						sum += a[i];
					}

					c *= 10;
				}
				count++;

			}
			// System.out.print(" ");

		}
		System.out.print("Сумма чисел с нечетными цифрами = ");

		return out(sum);

	}

	public static int sumPositive(int sum) {

		int s = 0;
		int c = 1;
		int g = 0;
		int count = 0;

		while (count < y(sum)) {

			g = sum / c % 10;

			if (g % 2 == 0) {
				s += g;
			}

			c *= 10;
			count++;
		}
		System.out.print("Сумма чутных цифр = ");
		return out(s);

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

	public static int out(int x) {

		System.out.println(x);

		return x;

	}
}

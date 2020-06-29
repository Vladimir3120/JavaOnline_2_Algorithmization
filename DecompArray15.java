package by.http.alltask;

public class DecompArray15 {

	/*
	 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {


		int n = 9;

		int[] a = new int[n];

		sort(a(a));

	}

	private static int[] a(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = i + 1;

		}
		return a;

	}

	public static void sort(int[] a) {

		int y = 1;
		int x = 0;

		while (x < 3) {

			for (int i = 0; i < a.length - y; i++) {

				int d = 1;

				System.out.print(a[i]);

				int count = 0;
				while (count < y) {

					System.out.print(a[i] + d);

					count++;
					d++;
				}
				System.out.print(" ");

			}
			x++;
			y++;
		}
	}
}
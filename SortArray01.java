package by.http.alltask;

public class SortArray01 {

	/*
	 * Заданы два одномерных массива с различным количеством элементов и натуральное
	 * число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
	 * - м элементами первого, при этом не используя дополнительный массив.
	 */

	public static void main(String[] args) {

		int n, m, k;

		n = 6;
		m = 3;
		k = 2;

		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[n + m];

		aInitialization(a);

		bInitialization(b);

		combine(a, b, c, k);

	}

	public static int[] aInitialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = i * a.length + 1;

			System.out.print(a[i] + " ");

		}
		return a;

	}

	public static int[] bInitialization(int[] b) {

		System.out.println();

		for (int i = 0; i < b.length; i++) {

			b[i] = i * b.length + 1;

			System.out.print(b[i] + " ");

		}
		return b;

	}

	public static int[] combine(int[] a, int[] b, int[] c, int k) {

		System.out.println();

		int count = 0;
		for (int i = 0; i <= k; i++) {

			c[i] = a[i];
			count++;

		}
		for (int i = 0; i < b.length; i++) {

			c[count++] = b[i];

		}

		for (int i = k + 1; i < a.length; i++) {

			if (count < c.length) {
				c[count++] = a[i];

			}
		}
		return outCombine(c);

	}

	public static int[] outCombine(int[] c) {

		for (int i = 0; i < c.length; i++) {

			System.out.print(c[i] + " ");

		}
		return c;
	}
}

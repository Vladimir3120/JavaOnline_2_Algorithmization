package by.http.alltask;

public class DecompArray08 {

	/*
	 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
	 * D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
	 * вычисления суммы трех последовательно расположенных элементов массива с
	 * номерами от k до m.
	 */

	public static void main(String[] args) {

		int n = 6;

		int[] d = new int[n];

		dInitialization(d);

		name(d);

	}

	public static int[] dInitialization(int[] d) {

		for (int i = 0; i < d.length; i++) {

			d[i] = (int) (Math.random() * 10);
			System.out.print(d[i] + " ");

		}
		System.out.println();
		return d;

	}

	public static void name(int[] d) {

		int k = 0;
		int m = 3;
		int[] s = new int[d.length / 2];

		int count = 0;
		while (count < s.length) {
			for (int i = k; i < m; i++) {

				s[count] += d[i];

			}
			count++;

			if (count == 1) {
				k += 2;
				m += 2;

			} else {

				m++;
				k++;
			}

		}

		for (int i = 0; i < s.length; i++) {

			System.out.print(s[i] + " ");

		}

	}

}

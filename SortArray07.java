package by.http.alltask;

public class SortArray07 {

	/*
	 * Пусть даны две неубывающие последовательности действительных чисел a1 < a2 <
	 * ... < an и b1 < b2 < ... < bm; Требуется указать те места, на которые нужно
	 * вставлять элементы последовательности b1, b2...bm в первую последовательность
	 * так, чтобы новая последовательность оставалась возрастающей.
	 */

	public static void main(String[] args) {

		int[] a1 = { 2, 6, 11, 13, 14, 18 };
		int[] b1 = { 3, 4, 7, 12, 15, 19, 20 };
		int[] c1 = new int[a1.length + b1.length];

		sort(a1, b1, c1);

	}

	public static void sort(int[] a1, int[] b1, int[] c1) {

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < c1.length; i++) {

			if (count1 < a1.length && count2 < b1.length) {

				if (a1[count1] > b1[count2]) {
					System.out.print(i + " ");

					c1[i] = b1[count2];

					count2++;

				} else {
					c1[i] = a1[count1];

					count1++;
				}
			}

		}

	}
}
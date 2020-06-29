package by.http.alltask;

public class SortArray03 {

	/*
	 * Сортировка выбором. Дана последовательность чисел a1 < a2 < ... <
	 * an.Требуется переставить элементы так, чтобы они были расположены по
	 * убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
	 * элемент и ставится на первое место, а первый - на место наибольшего. Затем,
	 * начиная со второго, эта процедура повторяется. Написать алгоритм сортировки
	 * выбором.
	 */

	public static void main(String[] args) {

		int n = 8;

		int[] a = new int[n];

		aInitialization(a);

		sort(a);

	}

	public static int[] aInitialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = i + 1;

		}
		return out(a);

	}

	public static int[] sort(int[] a) {

		System.out.println();

		for (int i = 0; i < a.length; i++) {

			int min = a[i];
			int mind = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > min) {
					min = a[j];
					mind = j;
				}

			}

			int temp = a[i];
			a[i] = min;
			a[mind] = temp;

		}
		return out(a);
	}

	public static int[] out(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		return a;

	}

}

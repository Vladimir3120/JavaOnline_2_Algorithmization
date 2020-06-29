package by.http.alltask;

public class SortArray04 {

	/*
	 * Сортировка обменами. Дана последовательность чисел a1 < a2 < ... <
	 * an.Требуется переставить числа в порядке возрастания. Для этого сравниваются
	 * два соседних числа ai, a(i+1). Если ai > ai+1, то делается перестановка. Так
	 * продолжается до тех пор, пока все элементы не станут расположены в порядке
	 * возрастания. Составить алгоритм сортировки, подсчитывая при этом количества
	 * перестановок.
	 */

	public static void main(String[] args) {

		int n = 8;

		int[] a = new int[n];

		aInitialization(a);

		sort(a);

	}

	public static int[] aInitialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 50);

		}
		return outArray(a);

	}

	public static int[] sort(int[] a) {
		int change = 0;

		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] < a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSorted = false;
					change++;
				}

			}
		}

		System.out.println();
		System.out.println(change + " - колличество перестановок");
		return outArray(a);

	}

	public static int[] outArray(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

		return a;

	}
}
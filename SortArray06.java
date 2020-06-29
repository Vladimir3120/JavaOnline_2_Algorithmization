package by.http.alltask;

public class SortArray06 {

	/*
	 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
	 * элемента ai и ai+1. Если ai < ai+1, то продвигаютсяна один элемент вперед.
	 * Если ai > ai+1, то производится перестановка и сдвигаются на один элемент
	 * назад.Составить алгоритм этой сортировки.
	 */

	public static void main(String[] args) {

		int n = 12;

		int[] a = new int[n];

		initialization(a);
		sortShell(a);

	}

	public static int[] initialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

		}
		return out(a);

	}

	public static int[] sortShell(int[] a) {

		int d = a.length / 2;

		while (d > 0) {

			for (int i = 0; i < a.length - d; i++) {

				int j = i;

				while (j >= 0 && a[j] > a[j + d]) {

					int temp = a[j];
					a[j] = a[j + d];
					a[j + d] = temp;
					j--;

				}
			}
			d = d / 2;
		}
		System.out.println();
		return out(a);

	}

	public static int[] out(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

		return a;

	}
}
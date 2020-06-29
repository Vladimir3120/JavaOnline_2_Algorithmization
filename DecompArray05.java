package by.http.alltask;

public class DecompArray05 {

	/*
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число, которое меньше максимального элемента массива, но
	 * больше всех других элементов).
	 */

	public static void main(String[] args) {

		int n = 8;

		int[] a = new int[n];

		initialization(a);
		sort(a);
		outElement(a);

	}

	public static int[] initialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 50);
			System.out.print(a[i] + " ");
		}

		return a;

	}

	public static void sort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}

	}

	public static void outElement(int[] a) {

		System.out.println();
		for (int i = 0; i < a.length; i++) {

			if (a[i] > a[i + 1]) {
				System.out.println(
						"Число меньше максимального элемента массива, но больше всех других элементов = " + a[i + 1]);
				break;
			}

		}
	}

}

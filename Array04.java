package by.http.alltask;

public class Array04 {

	/*
	 * Даны действительные числа a₁,a₂,...,aₙ . Поменять местами наибольший и
	 * наименьший элементы.
	 */

	public static void main(String[] args) {

		int[] a = { 12, 4, 456, 25, 9, 3, 78 };

		change(a);

	}

	public static int[] change(int[] a) {

		int max = 0;
		int min = 0;
		int indexMax = 0;
		int indexMin = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					min = a[j];

				}
				if (a[i] < a[j]) {
					max = a[j];
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				indexMin = i;
			}
			if (a[i] == max) {
				indexMax = i;
			}
		}

		System.out.println("Обмен местами наибольшего и наименьшего элемента ");
		for (int i = 0; i < a.length; i++) {
			a[indexMin] = max;
			a[indexMax] = min;
			System.out.print(a[i] + " ");

		}
		return a;
	}
}

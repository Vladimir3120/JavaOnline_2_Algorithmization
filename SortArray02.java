package by.http.alltask;

public class SortArray02 {

	/*
	 * Даны две последовательности a1<a2<...<an и b1<b2<...<bn. Образовать из них
	 * новую последовательность чисел так, чтобы она тоже была неубывающей.
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {

		int n = 5;

		int[] a = new int[n];
		int[] b = new int[n];

		aInitialization(a);

		bInitialization(b);

		newSequence(a, b);

	}

	public static int[] aInitialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = i + 1 + i;

			System.out.print(a[i] + " ");

		}

		return a;
	}

	public static int[] bInitialization(int[] b) {

		System.out.println();
		for (int i = 0; i < b.length; i++) {

			b[i] = i + 2 + i;

			System.out.print(b[i] + " ");

		}

		return b;

	}

	public static void newSequence(int[] a, int[] b) {

		System.out.println();
		for (int i = 0; i < a.length; i++) {

			if (a[i] < b[i]) {
				System.out.print(a[i] + " ");
				System.out.print(b[i] + " ");
			}

		}

	}

}
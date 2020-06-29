package by.http.alltask;

public class Array08 {

	/*
	 * Дана последовательность целых чисел (a₁,a₂,...,aₙ). Образовать новую
	 * последовательность, выбросив из данной min(a₁,a₂,...,aₙ)
	 */
	public static void main(String[] args) {

		int[] a = new int[] { 64, 50, 76, 8, 13, 53, 82, 6, 6, 38, 72, 55, 25, 49, 34 };

		initialization(a);

		newSequence(a);

	}

	public static int[] initialization(int[] a) {

		System.out.print("Последовательность: >> ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		return a;

	}

	public static int[] newSequence(int[] a) {
		System.out.println();
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] <= min) {
				min = a[i];
			}
		}

		System.out.print("Новая последовательность: >> ");
		for (int i = 0; i < a.length; i++) {

			if (a[i] > min) {

				System.out.print(a[i] + " ");
			}
		}
		return a;

	}

}

package by.http.alltask;

public class Array02 {

	/*
	 * Дана последовательность действительных чисел a₁,a₂,...,aₙ. Заменить все ее
	 * члены, большие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {

		int n = 8;
		int z = 6;

		int[] a = new int[n];

		initialization(a, n);
		change(a, z);

	}

	public static int[] initialization(int[] a, int n) {

		System.out.print("array values: >> ");
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * (i + n));
			System.out.print(a[i] + "; ");
		}
		System.out.println();
		return a;

	}

	public static int[] change(int[] a, int z) {

		System.out.println("\n" + "Член больше Z = " + z + "; меняем на Z ");
		System.out.print("array change: >> ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				System.out.print(a[i] + "; ");
			} else {
				System.out.print(a[i] + "; ");
			}

		}

		return a;

	}

}

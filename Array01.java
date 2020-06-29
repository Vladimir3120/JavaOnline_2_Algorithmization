package by.http.alltask;

public class Array01 {

	/*
	 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые
	 * кратны данному К.
	 */

	public static void main(String[] args) {

		int k = 3;

		int[] a = new int[] { 12, 4, 456, 85, 745, 9, 13, 4 };

		multiply(a, k);

	}

	public static int multiply(int[] a, int k) {
		int value = 0;

		System.out.println("Числа кратные заданному K = " + k);
		for (int i = 0; i < a.length; i++) {

			if (a[i] % k == 0) {
				System.out.print(a[i] + "; ");
			}

		}

		return value;

	}

}

package by.http.alltask;

public class Array06 {

	/*
	 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */

	public static void main(String[] args) {

		int n = 15;
		int[] a = new int[n];

		inicialization(a, n);
		sumOfSimpleIndex(a, n);

	}

	public static int[] inicialization(int[] a, int n) {
		System.out.print("Числа: >> ");
		for (int i = 0; i < a.length; i++) {
			a[i] = (15 + i) + (int) (Math.random());
			System.out.print(a[i] + " ");
		}

		return a;
	}

	public static int[] sumOfSimpleIndex(int[] a, int n) {

		// решето Эратосфена для индексов
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i <= n / i; i++) {
			if (isPrime[i]) {
				for (int j = i; j <= n / i; j++) {
					isPrime[i * j] = false;
				}
			}
		}

		// сумма
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				sum += a[i];
				System.out.print(a[i] + " ");

			}

		}
		System.out.println("\n" + "Cуммa чисел, порядковые номера которых вляются простыми числами: = " + sum);

		return a;

	}
}
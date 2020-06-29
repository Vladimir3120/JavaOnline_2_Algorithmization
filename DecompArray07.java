package by.http.alltask;

public class DecompArray07 {

	/*
	 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
	 * от 1 до 9.
	 */

	public static void main(String[] args) {

		int n = 9;

		int[] a = new int[n];

		initialization(a);

		sumOfFactorial(a);
	}

	public static int[] initialization(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = i + 1;

			System.out.print(a[i] + " ");

		}

		return a;

	}

	public static void sumOfFactorial(int[] a) {
		System.out.println();

		int k = 1;
		int sum = 0;

		System.out.print("Факториалы нечетных: >> ");
		for (int i = 0; i < a.length; i++) {

			k *= a[i];
			a[i] = k;

			if (i % 2 == 0) {
				sum += a[i];
				System.out.print(a[i] + " ");
			}

		}
		System.out.println();
		System.out.print("Cумма факториалов всех нечетных чисел от 1 до 9 = " + sum + " ");
	}
}

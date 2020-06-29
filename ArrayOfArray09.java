package by.http.alltask;

public class ArrayOfArray09 {

	/*
	 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму.
	 */

	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		initialization(a);

		sumAndMax(a);
	}

	public static int[][] initialization(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				a[i][j] = (int) (Math.random() * 50);

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}
		return a;
	}

	public static int sumAndMax(int[][] a) {

		int max = 0;

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {

				sum += a[j][i];

			}

			System.out.print(sum + "\t");

			if (sum > max) {
				max = sum;
			}
		}
		System.out.println("\n" + "\n" + "max = " + max);

		return 0;

	}

}

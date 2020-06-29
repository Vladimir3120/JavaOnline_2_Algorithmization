package by.http.alltask;

public class ArrayOfArray07 {

	/*
	 * Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I² - J²)
	 * / N) и подсчитать количество положительных элементов в ней
	 */

	public static void main(String[] args) {

		int n = 6;

		double[][] a = new double[n][n];

		initialization(a, n);

		sumPositiveElements(a);

	}

	public static double[][] initialization(double[][] a, int n) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2) / n));

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();

		}
		return a;

	}

	public static double[][] sumPositiveElements(double[][] a) {

		System.out.println();

		int sumPositive = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i][j] > 0) {
					sumPositive++;
				}

			}

		}
		System.out.println("sumPositive = " + sumPositive);
		return a;

	}

}

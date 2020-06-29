package by.http.alltask;

public class ArrayOfArray03 {

	/*
	 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	 */

	public static void main(String[] args) {

		int n = 10;
		int k = 4;
		int p = 2;

		int[][] a = new int[n][n];

		initialization(a);

		rowColumn(a, k, p);

	}

	public static int[][] initialization(int[][] a) {

		System.out.println("Вывод значений массива");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = 1 + (int) (Math.random() * 50);

				System.out.print(a[i][j] + "\t");
			}
			System.out.println();

		}

		return a;

	}

	public static int[][] rowColumn(int[][] a, int k, int p) {

		System.out.println("\n" + "Вывод k-й строки и p-й столбца матрицы.");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (j == p) {
					System.out.print(a[i][j] + "\t");

				} else if (i == k) {
					System.out.print(a[i][j] + "\t");

				} else {
					System.out.print("\t");
				}

			}
			System.out.println();

		}

		return a;

	}

}

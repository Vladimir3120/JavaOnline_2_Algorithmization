package by.http.alltask;

public class ArrayOfArray02 {

	/*
	 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	 */

	public static void main(String[] args) {

		int n = 7;

		int[][] a = new int[n][n];

		initialization(a);

		diagonalElement(a);

	}

	public static int[][] initialization(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = i + (int) (Math.random() * 50);

			}
		}
		return a;
	}

	public static int[][] diagonalElement(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (i == j) {

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
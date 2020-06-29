package by.http.alltask;

public class ArrayOfArray14 {

	/*
	 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
	 * каждом столбце число единиц равно номеру столбца.
	 */

	public static void main(String[] args) {

		int n = 10;
		int m = 8;

		int[][] a = new int[n][m];

		oneOfZero(a);

	}

	public static void oneOfZero(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (i == j || j > i) {
					a[i][j] = 1;

				} else {
					a[i][j] = 0;
				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

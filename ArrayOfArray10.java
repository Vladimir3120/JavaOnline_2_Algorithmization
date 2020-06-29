package by.http.alltask;

public class ArrayOfArray10 {

	/*
	 * Найти положительные элементы главной диагонали квадратной матрицы.
	 */

	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		initialization(a);

		sumMainDiagonal(a);
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

	public static int sumMainDiagonal(int[][] a) {

		int sum = 0;
		System.out.println();
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (i == j) {

					sum += a[i][j];

				}

			}

		}
		System.out.println("sum main diagolnal = " + sum);

		return 0;

	}

}

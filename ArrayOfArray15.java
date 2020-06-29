package by.http.alltask;

public class ArrayOfArray15 {

	/*
	 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
	 */

	public static void main(String[] args) {

		int n = 3;
		int a, b, c, m;
		int[][] square = new int[n][n];

		a = 1;
		b = 1;
		c = n * b;

		m = (int) ((Math.pow(n, 2) + 1) / 2);

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square.length; j++) {

				if (i == j && i > 0 && n - (i + 1) != 0) {
					square[i][j] = m;
					System.out.print(square[i][j] + "\t");
				} else {
					System.out.print(square[i][j] + "\t");
				}

			}
			System.out.println();

		}

	}
}
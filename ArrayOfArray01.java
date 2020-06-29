package by.http.alltask;

public class ArrayOfArray01 {

	/*
	 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	 * больше последнего
	 */

	public static void main(String[] args) {

		int n = 8;

		int[][] a = new int[n][n];

		initialization(a);

		arrayOutput(a);

	}

	public static int[][] initialization(int[][] a) {

		System.out.println("Вывод значений массива");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = 1 + (int) (Math.random() * (i + 10));

				System.out.print(a[i][j] + "\t");
			}
			System.out.println();

		}
		return a;
	}

	public static int[][] arrayOutput(int[][] a) {

		System.out.println("\n" + "Вывод нечетных столбцов, у которых первый элемент больше последнего ");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j += 2) {

				if (a[0][j] > a[a.length - 1][j]) {

					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();

		}
		return a;
	}
}

package by.http.alltask;

public class ArrayOfArray12 {

	/*
	 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
	 */

	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		initialization(a);

		sortPositive(a);

		sortDecrease(a);

	}

	public static void initialization(int[][] a) {

		System.out.println("initialization");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				a[i][j] = (int) (Math.random() * 50);

				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void sortPositive(int[][] a) {

		System.out.println();
		System.out.println("sort increase");

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int j2 = 0; j2 < a.length - 1; j2++) {

					if (a[i][j2] > a[i][j2 + 1]) {

						temp = a[i][j2];
						a[i][j2] = a[i][j2 + 1];
						a[i][j2 + 1] = temp;
					}

				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}

	}

	public static void sortDecrease(int[][] a) {

		System.out.println();
		System.out.println("sort decrease");

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int j2 = 0; j2 < a.length - 1; j2++) {

					if (a[i][j2] < a[i][j2 + 1]) {

						temp = a[i][j2];
						a[i][j2] = a[i][j2 + 1];
						a[i][j2 + 1] = temp;
					}

				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}
	}
}

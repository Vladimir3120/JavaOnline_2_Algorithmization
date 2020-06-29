package by.http.alltask;

public class ArrayOfArray13 {

	/*
	 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
	 */

	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		initialization(a);

		sortIncrease(a);

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

	public static void sortIncrease(int[][] a) {

		System.out.println();
		System.out.println("sort increse");

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int j2 = 0; j2 < a.length - 1; j2++) {

					if (a[j2][i] > a[j2 + 1][i]) {

						temp = a[j2][i];
						a[j2][i] = a[j2 + 1][i];
						a[j2 + 1][i] = temp;
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

					if (a[j2][i] < a[j2 + 1][i]) {

						temp = a[j2][i];
						a[j2][i] = a[j2 + 1][i];
						a[j2 + 1][i] = temp;
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

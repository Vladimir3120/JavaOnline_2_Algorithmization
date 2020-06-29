package by.http.alltask;

public class ArrayOfArray11 {

	/*
	 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
	 * матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {

		int n = 10;
		int m = 20;

		int[][] a = new int[n][m];

		initialization(a, n, m);

		repeatedFive(a, n, m);

	}

	public static int[][] initialization(int[][] a, int n, int m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				a[i][j] = 0 + (int) (Math.random() * 15);

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}

		return a;

	}

	public static void repeatedFive(int[][] a, int n, int m) {
		System.out.println();
		System.out.println("Номер строки в которой цифра 5 встречется 3 или больше раз ");
		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < m; j++) {

				if (a[i + (i - i)][j] == 5) {
					count++;

				}
			}
			if (count >= 3) {
				System.out.println(i + 1 + "\t");
			}

		}
		System.out.println();

	}

}

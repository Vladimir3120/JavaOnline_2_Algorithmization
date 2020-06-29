package by.http.alltask;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfArray16 {

	/*
	 * Магическим квадратом порядка n называется квадратная матрица n*n составленная
	 * из чисел 1,2,3,...,n², так, что суммы по каждому столбцу, каждой строке и
	 * каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
	 * Пример магического квадрата порядка 3: 6 1 8 7 5 3 2 9 4
	 */

	public static void main(String[] args) {

		magicSquere();

	}

	public static void negativeSquare(int[][] a, int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				a[i][j] = 1 + ((i + j - 1 + (n - 1) / 2) % n) * n + ((i + 2 * j + 2) % n);

				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");

		}

	}

	public static void positivOnlyFour(int[][] a, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				count++;
				a[i][j] = count;
			}

		}

		int coun = 0;
		for (int i = 0; i < n / 2; i++) {
			int trr;
			if (i < n / 2) {
				trr = a[i][i];
				a[i][i] = a[n - 1 - coun][n - 1 - coun];
				a[n - 1 - coun][n - 1 - coun] = trr;
				coun++;
			}

		}
		int co = 0;
		for (int i = 0; i < n / 2; i++) {

			int tr;
			if (i < n / 2) {

				tr = a[n - 1 - co][i];
				a[n - 1 - co][i] = a[i][n - 1 - co];
				a[i][n - 1 - co] = tr;
				co++;

			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(a[i][j] + "\t");

			}
			System.out.println("\n");

		}
	}

	public static void magicSquere() {

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер магического квадрата: >>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите корректные данные");

		}

		n = sc.nextInt();

		int[][] a = new int[n + 1][n + 1];

		if (n % 2 != 0) {
			negativeSquare(a, n);

		} else if (n == 4) {
			positivOnlyFour(a, n);

		} else {
			System.out.println("Введите нечетное число от 3 и больше или 4");
		}

	}

}

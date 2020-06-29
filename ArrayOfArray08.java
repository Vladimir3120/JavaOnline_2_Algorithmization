package by.http.alltask;

import java.util.Scanner;

public class ArrayOfArray08 {

	/*
	 * В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры.
	 */

	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		initialization(a);

		changeColumn(a, column(), column());

	}

	public static int[][] initialization(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				a[i][j] = i + 1 * j;

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();

		}

		return a;

	}

	public static int column() {
		System.out.println();
		int c = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите номер столбца для замены: >> ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите цифру: >> ");
		}

		c = sc.nextInt();

		return c;

	}

	public static int[][] changeColumn(int[][] a, int c1, int c2) {

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				int temp = a[i][c1];
				a[i][c1] = a[i][c2];
				a[i][c2] = temp;

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}

		return a;

	}
}
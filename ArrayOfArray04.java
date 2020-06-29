package by.http.alltask;

public class ArrayOfArray04 {

//	4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	1  2   3  ... n
//	n n-1 n-2 ... 1
//	1  2   3  ... n
//	n n-1 n-2 ... 1
//	...............
//	n n-1 n-2 ... 1
//	 
	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		sqMatrix(a);

	}

	public static int[][] sqMatrix(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = j + 1;

				if (i % 2 != 0) {
					a[i][j] = a.length - j;
					System.out.print(a[i][j] + "\t");

				} else {

					System.out.print(a[i][j] + "\t");
				}

			}
			System.out.println();
		}
		return a;
	}
}
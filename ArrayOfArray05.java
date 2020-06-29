package by.http.alltask;

public class ArrayOfArray05 {

//	5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	  1 1 1 ... 1 1 1
//	  2 2 2 ... 2 2 0
//	  3 3 3 ... 3 0 0
//	  ...............
//	  n-1 n-1 ..0 0 0
//	  n 0 0 ... 0 0 0

	public static void main(String[] args) {

		int n = 6;

		int[][] a = new int[n][n];

		sqArray(a);

	}

	public static int[][] sqArray(int[][] a) {

		int m = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (j < m) {
					a[i][j] = i + 1;

					System.out.print(a[i][j] + "\t");
				} else {
					a[i][j] = 0;
					System.out.print(a[i][j] + "\t");
				}
			}
			m--;
			System.out.println();

		}
		return a;
	}
}
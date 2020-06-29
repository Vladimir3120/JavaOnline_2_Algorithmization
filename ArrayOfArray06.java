package by.http.alltask;

public class ArrayOfArray06 {

//	6.  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//		 1 1 1 ... 1 1 1
//		 0 1 1 ... 1 1 0
//		 0 0 1 ... 1 0 0
//		 ...............
//		 0 1 1 ... 1 1 0
//		 1 1 1 ... 1 1 1

	public static void main(String[] args) {

		int n = 6;
		
		int[][] a = new int[n][n];

		sqArray(a, n);

	}

	public static int[][] sqArray(int[][] a, int n) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (j == n - (i + 1) || i < j && n - (i + 1) > j || i == j
						|| n - i - 1 < n - j - 1 && i > n - (j + 1)) {

					a[i][j] = 1;

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
package by.http.alltask;

public class Array03 {

	/*
	 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов
	 */

	public static void main(String[] args) {

		int n = 13;

		int[] a = new int[n];

		initialization(a, n);

		calculate(a);

	}

	public static int[] initialization(int[] a, int n) {

		System.out.print("array values: >> ");
		for (int i = 0; i < a.length; i++) {
			a[i] = -5 + (int) (Math.random() * (i + n));
			System.out.print(a[i] + "; ");
		}
		System.out.println();
		return a;

	}

	public static int[] calculate(int[] a) {

		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			}
			if (a[i] > 0) {
				positive++;
			}
			if (a[i] < 0) {
				negative++;
			}

		}

		System.out.println("Pozitive values = " + positive + " ");
		System.out.println("Negatine values = " + negative + " ");
		System.out.println("Zero values= " + zero + " ");

		return a;

	}
}

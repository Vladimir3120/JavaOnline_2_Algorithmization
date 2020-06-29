package by.http.alltask;

public class DecompArray10 {

	/*
	 * Дано натуральное число N. Написать метод(методы) для формирования массива,
	 * элементами которого являются цифры числа N
	 */

	public static void main(String[] args) {

		int n = 12365897;

		int[] a = new int[String.valueOf(n).length()];

		createArray(a, n);

	}

	public static int[] createArray(int[] a, int n) {

		for (int i = a.length - 1; i >= 0; i--) {

			a[i] = n % 10;

			n /= 10;

		}
		return out(a);
	}

	public static int[] out(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		return a;

	}

}

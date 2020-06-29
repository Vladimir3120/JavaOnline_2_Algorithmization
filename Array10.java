package by.http.alltask;

public class Array10 {

	/*
	 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из
	 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {

		int n = 12;

		int[] a = new int[n];

		a = sequence(a);

	}

	public static int[] sequence(int[] a) {

		for (int i = 0; i < a.length; i++) { // Вывод массива
			a[i] = -3 + i;
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				System.out.print(a[i] + " "); // Вывод нечетного значения
			}
			if (i % 2 != 0) {
				a[i] = 0;
				System.out.print(a[i] + " "); // Вывод четного значения = 0
			}

		}
		return a;

	}

}

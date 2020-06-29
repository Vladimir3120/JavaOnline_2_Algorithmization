package by.http.alltask;

public class Array09 {

	/*
	 * В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */
	
	public static void main(String[] args) {

		int[] a = new int[] { 1, 5, 2, 9, 2, 7, 7, 2 };

		minResemble(a);

	}

	public static int minResemble(int[] a) {

		int[] r = new int[a.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) { // Находим схожие значения

			for (int j = i + 1; j < a.length - 1; j++) {

				if (a[i] == a[j]) {

					r[count] = a[i];
					count++;

				}
			}
		}

		if (count != 0) {

			int min = r[0];
			for (int i = 0; i < count; i++) { // Сравниваем и выводим минимальное

				if (r[i] <= min) {

					min = r[i];

					System.out.println(min);
				}
			}

		} else {
			System.out.println("Встречающихся значений нет!");
		}
		return count;

	}

}

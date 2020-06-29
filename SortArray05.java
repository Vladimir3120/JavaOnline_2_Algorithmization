package by.http.alltask;

import java.util.Arrays;

import javax.sound.midi.MidiChannel;

public class SortArray05 {

	/*
	 * Сортировка вставками. Дана последовательность чисел a1, a2 ... an. Требуется
	 * переставить числа в порядке возрастания. Делается это следующим образом.
	 * Пусть a1, a2 ... ai - упорядоченная последовательность, т. е. a1 < a2 < ... <
	 * an. Берется следующее число a(i + 1) и вставляется в последовательность так,
	 * чтобы новая последовательность была тоже возрастающей. Процесс производится
	 * до тех пор, пока все элементы от i + 1 до n не будут перебраны. Примечание.
	 * Место помещения очередного элемента в отсортированную часть производить с
	 * помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
	 */

	public static void main(String[] args) {

		int[] a = { 12, 3, 45, 4, 5, 6, 78, 14, 3, 6 };

		sort(out(a));

	}

	public static int[] sort(int[] a) {
		System.out.println();
		int key = 0;
		for (int i = 1; i < a.length; i++) {

			key = a[i];

			int j = i - 1;

			while (j >= 0 && key < a[j]) {

				a[j + 1] = a[j];
				j--;

			}

			a[j + 1] = key;
			System.out.print(binarySearch(a, key) + " < " + key + "| ");
		}

		System.out.println();
		return out(a);

	}

	public static int binarySearch(int[] a, int key) {

		int low = 0;
		int high = a.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (key < a[mid]) {
				high = mid - 1;
			} else if (key > a[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

	public static int[] out(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

		return a;

	}
}
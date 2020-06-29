package by.http.alltask;

public class Array05 {

	/*
	 * Даны целые числа а₁,а₂ ,..., аₙ . Вывести на печать только те числа, для
	 * которых аᵢ > i.
	 */

	public static void main(String[] args) {

		int[] a = { 12, 45, 2, 9, 0, 789, 27, 4, 3 };

		method(a);

	}

	public static int[] method(int[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}
		}
		return a;

	}

}

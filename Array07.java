package by.http.alltask;

import java.util.Arrays;

public class Array07 {

	/*
	 * Даны действительные числа (a₁,a₂,...,aₙ). Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...
	 * aₙ | aₙ₊₁)
	 */

	public static void main(String[] args) {

		int[] a = new int[] { 64, 50, 76, 8, 13, 53, 6, 82, 34, 38, 72, 55, 25, 49, 34 };

		max(a);

	}

	public static int max(int[] a) {

		int max = a[0];

		System.out.print("(a1 + a2n, a2 + a2n-1,...,an+an+1): >> ");
		for (int i = 0; i < a.length - 1; i++) {

			a[i] = a[i] + a[i + 1];
			System.out.print(a[i] + " ");

			if (a[i] >= max) {
				max = a[i];
			}
		}

		System.out.println("\n" + "\n" + "max = " + max);

		return max;

	}
}
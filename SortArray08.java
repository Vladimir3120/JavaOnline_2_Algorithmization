package by.http.alltask;

public class SortArray08 {

	/*
	 * Даны дроби p1/q1, p2/q2,.., pn/qn(pi,qi - натуральные). Составить программу,
	 * которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке
	 * возрастания.
	 */

	public static void main(String[] args) {

		int n = 8;

		int[] numerator = new int[n];
		int[] denominator = new int[n];

		for (int i = 0; i < n; i++) {
			numerator[i] = 1 + (int) (Math.random() * 10);
			denominator[i] = 1 + (int) (Math.random() * 10);

		}

		method(numerator, denominator, n);

	}

	public static void method(int[] numerator, int[] denominator, int n) {

		int el = 0;
		el = nok(denominator[0], denominator[1]);

		for (int i = 0; i < n; i++) {
			el = nok(el, denominator[i]);

		}

		for (int i = 0; i < n; i++) {

			numerator[i] = el / denominator[i] * numerator[i];
			denominator[i] = el;
		}

		for (int i = 0; i < numerator.length; i++) {
			for (int j = 0; j < numerator.length; j++) {

				if (numerator[j] > numerator[i]) {
					int temp = numerator[j];
					numerator[j] = numerator[i];
					numerator[i] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(numerator[i] + "/" + denominator[i] + " ");
		}

	}

	private static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		return a + b;
	}

	private static int nok(int a, int b) {
		return a / nod(a, b) * b;
	}
}

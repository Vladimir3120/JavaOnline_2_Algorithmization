package by.http.alltask;

public class DecompArray01 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел: HOK(A,B) = (A*B)/
	 * НОД(A,B)
	 */

	public static void main(String[] args) {

		int a = 5;
		int b = 2;

		System.out.println("НОД = " + nod(a, b));
		System.out.println("НОК = " + nok(a, b));
	}

	private static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}

	private static int nok(int a, int b) {

		return a / nod(a, b) * b;
	}

}

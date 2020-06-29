package by.http.alltask;

public class DecompArray11 {

	/*
	 * Написать метод(методы), определяющий, в каком из данных двух чисел больше
	 * цифр.
	 */

	public static void main(String[] args) {

		int a = 12;
		int b = 9873;

		compare(a, b);

	}

	public static void compare(int a, int b) {

		int s1 = String.valueOf(a).length();
		int s2 = String.valueOf(b).length();

		if (s1 > s2) {

			System.out.println("В числе (a) цифр больше, чем в числе (b)");

		} else {

			System.out.println("В числе (b) цифр больше, чем в числе (a)");
		}

	}

}

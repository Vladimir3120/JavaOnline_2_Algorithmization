package by.http.alltask;

public class DecompArray13 {

	/*
	 * Два простых числа называются «близнецами», если они отличаются друг от друга
	 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
	 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int n = 100;

		prime(n);
	}

	public static int[] prime(int n) {
		int[] a = new int[n];
		
		int counnt = 0;
		
		boolean isprime;
		
		for (int i = n; i < n * 2; i++) {
			isprime = true;

			for (int j = 2; j <= i / j; j++)

				if ((i % j) == 0) {
					isprime = false;
				}

			if (isprime) {
				// System.out.println(i + " - простое число.");
				a[counnt] = i;
				counnt++;
			}
		}
		for (int i = 0; i < counnt; i++) {

			if(a[i+1]  - a[i] == 2) {
			System.out.println(a[i] + " " + a[i+1]);
			}
		}

		return a;
	}
}

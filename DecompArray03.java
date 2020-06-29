package by.http.alltask;

public class DecompArray03 {

	/*
	 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
	 * вычисления площади треугольника.
	 */

	public static void main(String[] args) {

		int a = 8;

		method(a);

	}

	public static void method(int a) {

		double s = ((3 * Math.sqrt(3)) / 2 * Math.pow(a, 2));

		System.out.println("S правильного шестиугольника = " + s);

	}

}

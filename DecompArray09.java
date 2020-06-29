package by.http.alltask;

public class DecompArray09 {

	/*
	 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
	 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
	 */

	public static void main(String[] args) {

		double x = 5;
		double y = 8;
		double z = 4;
		double t = 6;
		double degree = 90;

		sSquare(s1(x, y, degree), s2(x, y, z, t, degree));

	}

	public static double s1(double x, double y, double degree) {
		double s1 = 0;

		if (degree == 90) {

			s1 = x * y / 2;

		} else {
			System.out.println("Угол не равен 90°");
		}

		return s1;

	}

	public static double s2(double x, double y, double z, double t, double degree) {

		double diagonal = 0;
		double p = 0;
		double s2 = 0;

		if (degree == 90) {

			diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

			p = (z + t + diagonal) / 2;

			s2 = Math.sqrt(p * (p - z) * (p - t) * (p - diagonal));

		}

		return s2;
	}

	private static double sSquare(double s1, double s2) {

		double sSquare = s1 + s2;

		System.out.println("Площадь четырехугольника = " + sSquare);

		return sSquare;
	}

}

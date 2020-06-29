package by.http.alltask;

public class DecompArray04 {

	/*
	 * На плоскости заданы своими координатами n точек. Написать метод(методы),
	 * определяющие, между какими из пар точек самое большое расстояние. Указание.
	 * Координаты точек занести в массив.
	 */

	public static void main(String[] args) {

		double[] x = { 0, 9, 4, -15 };
		double[] y = { 1, 15, -6, -3 };

		int k = 0;
		double[] dist = new double[x.length - 1 + y.length - 1];

		createPoinstValue(x, y, dist);
		k = foundElement(dist);
		outMaxPoins(x, y, dist, k);

	}

	public static void createPoinstValue(double[] x, double[] y, double[] dist) {

		int count = 0;
		int count1 = 0;

		while (count < x.length) {

			for (int i = count; i < y.length - 1; i++) {

				dist[count1] = Math.sqrt(Math.pow(x[i + 1] - x[count], 2) + Math.pow(y[i + 1] - y[count], 2));

//				System.out.println("[" + x[i + 1] + " " + y[i + 1] + "]" + "[" + x[count] + " " + y[count] + "]"
//						+ "\t| " + dist[count1]);

				count1++;
			}
			count++;

		}
	}

	public static int foundElement(double[] dist) { // находим номер елемента с наибоольшими значениями

		int k = 0;

		double max = dist[0];
		for (int i = 0; i < dist.length; i++) {

			if (max <= dist[i]) {
				max = dist[i];
				k = i;
			}

		}
		return k;

	}

	private static void outMaxPoins(double[] x, double[] y, double[] dist, int k) {

		int count = 0;
		int count1 = 0;

		while (count < x.length) {

			for (int i = count; i < y.length - 1; i++) {

				dist[count1] = Math.sqrt(Math.pow(x[i + 1] - x[count], 2) + Math.pow(y[i + 1] - y[count], 2));

				if (count1 == k) {
					System.out.println("Наибольшее расстояние между точками " + "[" + x[i + 1] + " " + y[i + 1] + "]"
							+ "[" + x[count] + " " + y[count] + "]" + " | = " + dist[count1]);

				}
				count1++;
			}
			count++;

		}

	}

}

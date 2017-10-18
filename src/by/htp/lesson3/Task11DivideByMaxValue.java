package by.htp.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task11DivideByMaxValue {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		System.out.println("Enter a number");
		int arraySize = Integer.parseInt(in.readLine());

		int[] array = initializeArray(arraySize);

		int max = maxValue(array);

		double[] result = divideByMax(array, max);

		for (double x : result) {
			System.out.print(x + ", ");
		}

	}

	public static int[] initializeArray(int arraySize) throws Exception {

		int[] array = new int[arraySize];
		System.out.println("Enter " + arraySize + " numbers");

		for (int i = 0; i < arraySize; i++) {
			array[i] = Integer.parseInt(in.readLine());
		}

		return array;
	}

	public static int maxValue(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	public static double[] divideByMax(int[] array, int max) {
		double[] result = new double[array.length];

		for (int i = 0; i < array.length; i++) {
			double temp = Math.round((array[i] * 100.0) / max);
			result[i] = temp / 100;
		}

		return result;
	}

}

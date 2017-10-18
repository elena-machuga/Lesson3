package by.htp.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10PositiveInArray {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		System.out.println("Enter a number");
		int arraySize = Integer.parseInt(in.readLine());

		int[] array = initializeArray(arraySize);

		int[] result = firstPositive(array);

		if (result[0] == 0) {
			System.out.println("No positive number was found.");
		} else {
			System.out.println(
					"The first positive number has value of " + result[0] + " and is on " + result[1] + " position.");
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

	public static int[] firstPositive(int[] array) {
		int[] result = new int[2];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				result[0] = array[i];
				result[1] = i + 1;
				break;
			}
		}

		return result;
	}

}

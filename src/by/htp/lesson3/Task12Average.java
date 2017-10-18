package by.htp.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task12Average {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		System.out.println("Enter a number");
		int arraySize = Integer.parseInt(in.readLine());

		int[] array = initializeArray(arraySize);

		double avg = average(array);

		System.out.println(avg);

	}

	public static int[] initializeArray(int arraySize) throws Exception {
		int[] array = new int[arraySize];
		System.out.println("Enter " + arraySize + " numbers");

		for (int i = 0; i < arraySize; i++) {
			array[i] = Integer.parseInt(in.readLine());
		}
		return array;
	}

	public static double average(int array[]) {
		int sum = 0;
		int count = 0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum += array[i];
				count++;
				i++;
			} else {
				i++;
			}
		}
		if (count == 0) {
			avg = 0;
		} else {
			avg = sum * 1.0 / count;
		}
		return avg;
	}

}

package by.htp.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task06CountDigits {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number");
		int a = Integer.parseInt(in.readLine());

		if (a == 0) {
			System.out.println("This is zero!");
		} else if (a > 0) {
			System.out.println(digitMessage(a) + "is positive =)");
		} else {
			System.out.println(digitMessage(a) + " is negative :(");
		}

	}

	public static String digitMessage(int a) {
		String result;

		if (Math.abs(a) / 100.0 >= 1) {
			result = "Three digit number ";
		} else if (Math.abs(a) / 10.0 >= 1) {
			result = "Two digit number ";
		} else {
			result = "Single digit number ";
		}

		return result;
	}

}

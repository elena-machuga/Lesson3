package by.htp.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07LeapYear {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter year number");
		Integer year = Integer.parseInt(in.readLine());

		if ((year % 4) != 0 || ((year % 100) == 0 && (year % 400) != 0)) {
			System.out.println("This is not a leap year.");
		} else {
			System.out.println("This is a leap year.");
		}
	}

}

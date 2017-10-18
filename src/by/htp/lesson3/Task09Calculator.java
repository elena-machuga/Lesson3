package by.htp.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task09Calculator {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		System.out.println("Enter an operator +, -, * or /");

		char operator = in.readLine().charAt(0);

		if (operator == '0') {
			System.exit(0);
		} else {
			String response = "n";
			do {
				count(operator);
				response = goOn();
				if (response.equalsIgnoreCase("y")) {
					System.out.println("Enter an operator +, -, * or /");
					operator = in.readLine().charAt(0);
				}
			} while (response.equalsIgnoreCase("y"));
		}
	}

	public static void count(char operator) throws Exception {
		boolean tmp = true;
		do {
			if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
				System.out.println("Enter two numbers");
				int x = Integer.parseInt(in.readLine());
				int y = Integer.parseInt(in.readLine());
				boolean temp = true;
				do {
					if (y == 0 && operator == '/') {
						System.out.println("You can't divide by zero. Enter a valid number");
						y = Integer.parseInt(in.readLine());
						temp = true;
					} else {
						temp = false;
					}
				} while (temp);

				calculator(x, y, operator);

				tmp = false;

			} else {
				System.out.println("Incorrect operator. Enter a valid operator");
				operator = in.readLine().charAt(0);
				tmp = true;
			}
		} while (tmp);
	}

	public static void calculator(int x, int y, char operator) {
		double result = 0;
		switch (operator) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x * 1.0 / y;
			break;
		}
		System.out.println("Result is " + result);
	}

	public static String goOn() throws Exception {
		System.out.println();
		System.out.println("Do you want another calculation (y/n)?");
		String response = in.readLine();

		return response;
	}

}

package by.htp.lesson3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task04FourDigitNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter four digit number:");
		int number = Integer.parseInt(in.readLine());

		int firstNumber = number / 1000;
		int secontNumber = (number / 100) % 10;
		int thirdNumber = (number / 10) % 10;
		int fourthNumber = number % 10;

		int result = firstNumber * secontNumber + thirdNumber * fourthNumber;

		System.out.println("The first number is " + firstNumber);
		System.out.println("The second number is " + secontNumber);
		System.out.println("The third number is " + thirdNumber);
		System.out.println("The fourth number is " + fourthNumber);
		System.out.println("The result is " + result);

	}

}

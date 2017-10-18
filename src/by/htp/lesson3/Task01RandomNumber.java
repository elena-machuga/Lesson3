package by.htp.lesson3;
import java.util.Random;

public class Task01RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(900) + 100;
		System.out.println("Random number is " + x);

		int hundreds = x / 100;
		int dozens = (x - hundreds * 100) / 10;
		int units = x % 10;

		int multiply = hundreds * dozens * units;
		System.out.println("Product of tree numbers is " + multiply);

		int sum = hundreds + dozens + units;
		System.out.println("Sum of three numbers is " + sum);

	}

}

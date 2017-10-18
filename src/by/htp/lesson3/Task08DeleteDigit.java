package by.htp.lesson3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task08DeleteDigit {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number");
		
		int initialNumber = Integer.parseInt(in.readLine());
		ArrayList<Integer> array = new ArrayList<>();

		while (initialNumber >= 1) {
			int deduction = initialNumber % 10;
			array.add(deduction);
			initialNumber = initialNumber / 10;
		}

		System.out.println("Enter a digit");

		int digit = Integer.parseInt(in.readLine());

		int count = 0;

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == digit) {
				array.remove(i);
				i--;
				count++;
			}
		}

		if (count == 0) {
			array.add(digit);
		}

		for (int i = array.size() - 1; i >= 0; i--) {
			System.out.print(array.get(i));
		}

	}

}

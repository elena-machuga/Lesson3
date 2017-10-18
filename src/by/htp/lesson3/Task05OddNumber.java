package by.htp.lesson3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task05OddNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an odd and an even number");
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());

		if (a % 2 == 0) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}

	}

}

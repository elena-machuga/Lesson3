package by.htp.lesson3;

public class Task02Switch {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int b;

		System.out.println("Before:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		b = x;
		x = y;
		y = b;

		System.out.println("After:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}

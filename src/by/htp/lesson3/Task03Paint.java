package by.htp.lesson3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task03Paint {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a diameter, height and paint consumption");
		int diameter = Integer.parseInt(in.readLine());
		int height = Integer.parseInt(in.readLine());
		int consumption = Integer.parseInt(in.readLine());

		double roof = Math.PI * Math.sqrt(diameter) / 4;
		double side = Math.PI * diameter * height;

		double surface = roof + side;

		double paint = surface / consumption;

		int jars = (int) (paint + 1);

		System.out.println(jars);

	}

}

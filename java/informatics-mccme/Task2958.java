import java.util.Scanner;


public class Task2958 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		System.out.println((a * (a / b) + b * (b / a)) / (a / b + b / a));
		in.close();
	}
}

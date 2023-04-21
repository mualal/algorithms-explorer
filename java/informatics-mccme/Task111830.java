import java.util.Scanner;


public class Task111830 {

	static int quantity;

	public static int fib(int n) {
		quantity++;
		if (n <= 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		fib(n);
		System.out.println(quantity);
	}
}

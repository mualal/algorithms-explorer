import java.util.Scanner;


public class Task112183 {

	public static long octal(long N) {
		if (Math.abs(N) > 0) {
			octal(N / 8);
			System.out.print(Math.abs(N % 8));
			return 5;
		} else {
			return 5;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		in.close();
		if (N == 0) {
			System.out.println(0);
		} else {
			if (N > 0) {
				octal(N);
			} else {
				System.out.print("-");
				octal(N);
			}
		}
	}
}

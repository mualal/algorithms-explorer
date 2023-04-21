import java.util.Scanner;


public class Task112182 {
    
	public static long Binary(long N) {
		if (Math.abs(N) > 0) {
			Binary(N / 2);
			System.out.print(Math.abs(N % 2));
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
				Binary(N);
			} else {
				System.out.print("-");
				Binary(N);
			}
		}
	}
}

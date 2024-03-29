import java.util.Scanner;


public class Task112185 {

	public static long to_new_numeration(long N, long B) {
		if (Math.abs(N) > 0) {
			to_new_numeration(N / B, B);
			System.out.print(Math.abs(N % B));
			return 5;
		} else {
			return 5;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long B = in.nextLong();
		in.close();
		if (N == 0) {
			System.out.println(0);
		} else {
			if (N > 0) {
				to_new_numeration(N, B);
			} else {
				System.out.print("-");
				to_new_numeration(N, B);
			}
		}
	}
}

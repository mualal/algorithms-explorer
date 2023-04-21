import java.util.Scanner;


public class Task112253 {
    
	public static long number(long N, long k) {
		if (k <= Math.sqrt(N))
			if (N % k != 0) {
				return number(N, k + 1);
			} else {
				if (k == 1) {
					return 1;
				} else {
					return 0;
				}
			}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		in.close();
		if (N == 1) {
			System.out.println("NO");
		} else {
			if (N == 2) {
				System.out.println("YES");
			} else {
				if (number(N, 2) == 1) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}

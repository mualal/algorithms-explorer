import java.util.Scanner;


public class Task112254 {
    
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

	public static long divisors(long N, long k) {
		if (k <= N) {
			if (N % k == 0 && number(k, 2) == 1) {
				System.out.print(k + " ");
				N = N / k;
				return divisors(N, k);
			} else {
				return divisors(N, k + 1);
			}
		} else {
			return 5;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		in.close();
		if (N == 1) {
			System.out.println(1);
		} else {
			divisors(N, 2);
		}
	}
}

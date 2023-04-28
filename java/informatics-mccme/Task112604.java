import java.util.Scanner;


public class Task112604 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		in.close();
		long[] number = new long[N];
		for (int i = 0; i < N; i++) {
			number[i] = 0;
		}
		if (N == 1) {
			System.out.println("1");
		} else {
			number[0] = 1;
			number[1] = 1;
			for (int i = 2; i < N; i++) {
				int sl = K;
				if (i < sl)
					sl = i;
				for (int j = 1; j <= sl; j++) {
					number[i] = (number[i] + number[i - j]) % 1000007;
				}
			}
			System.out.print(number[N - 1]);
		}
	}
}

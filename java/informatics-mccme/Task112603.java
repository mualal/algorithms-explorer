import java.util.Scanner;


public class Task112603 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		in.close();
		int[] number = new int[N];
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
					number[i] += number[i - j];
				}
			}
			System.out.println(number[N - 1]);
		}
	}
}

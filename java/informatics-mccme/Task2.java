import java.util.Scanner;


public class Task2 {

	public static int nearest(int[] x, int N) {
		int a = 0;
		int b = x.length - 1;
		int c;
		do {
			c = (b + a) / 2;
			if (x[c] <= N)
				a = c;
			else
				b = c;
		} while ((b - a) > 1);
		if (Math.abs(x[a] - N) == Math.abs(x[b] - N))
			return (Math.min(x[a], x[b]));
		if (Math.abs(x[a] - N) < Math.abs(x[b] - N))
			return x[a];
		return x[b];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] arr_1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_1[i] = in.nextInt();
		}
		int[] arr_2 = new int[K];
		for (int i = 0; i < K; i++) {
			arr_2[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < K; i++) {
			System.out.println(nearest(arr_1, arr_2[i]));
		}
		return;
	}
}

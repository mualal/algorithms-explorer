import java.util.Scanner;


public class Task111728 {

	public static int Right(int[] x, int N) {
		int a = 0;
		int b = x.length - 1;
		int c;
		do {
			c = (b + a) / 2;
			if (N >= x[c])
				a = c;
			else
				b = c;
		} while (b - a > 1);
		if (x[a] != N && x[b] != N)
			return -1;
		if (x[b] == N)
			return b;
		return a;
	}

	public static int Left(int[] x, int N) {
		int a = 0;
		int b = x.length - 1;
		int c;
		do {
			c = (a + b) / 2;
			if (N > x[c])
				a = c;
			else
				b = c;
		} while (b - a > 1);
		if (x[a] != N && x[b] != N)
			return -1;
		if (x[a] == N)
			return a;
		return b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] arr_1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_1[i] = in.nextInt();
		}
		int[] arr_2 = new int[M];
		for (int i = 0; i < M; i++) {
			arr_2[i] = in.nextInt();
		}
		in.close();
		int left, right;
		for (int i = 0; i < M; i++) {
			left = Left(arr_1, arr_2[i]) + 1;
			right = Right(arr_1, arr_2[i]) + 1;
			if (left == 0)
				System.out.println(0);
			else
				System.out.println(left + " " + right);
		}
		return;
	}
}

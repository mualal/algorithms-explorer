import java.util.Scanner;


public class Task112301 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int K = in.nextInt();
		int M = in.nextInt();
		int R = in.nextInt();
		in.close();
		R = R % (M - K + 1);
		int[] new_1 = new int[M - K + 1];
		for (int i = K; i <= M; i++) {
			new_1[i - K] = arr[i - 1];
		}
		for (int i = 0; i < R / 2; i++) {
			int temp = new_1[i];
			new_1[i] = new_1[R - i - 1];
			new_1[R - i - 1] = temp;
		}
		for (int i = R; i < (M - K + 1 - R) / 2 + R; i++) {
			int temp = new_1[i];
			new_1[i] = new_1[M - K + R - i];
			new_1[M - K + R - i] = temp;
		}
		for (int i = 0; i < (M - K + 1) / 2; i++) {
			int temp = new_1[i];
			new_1[i] = new_1[M - K - i];
			new_1[M - K - i] = temp;
		}
		for (int i = K; i <= M; i++) {
			arr[i - 1] = new_1[i - K];
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

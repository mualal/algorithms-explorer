import java.util.Scanner;


public class Task112303 {

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
		int[] new_2 = new int[R];
		for (int i = M - K + 1 - 1; i > M - K + 1 - 1 - R; i--) {
			new_2[M - K + 1 - 1 - i] = new_1[i];
		}
		for (int i = M - K + 1 - 1; i >= R; i--) {
			new_1[i] = new_1[i - R];
		}
		for (int i = 0; i < R / 2; i++) {
			int temp = new_2[i];
			new_2[i] = new_2[R - 1 - i];
			new_2[R - 1 - i] = temp;
		}
		for (int i = 0; i < R; i++) {
			new_1[i] = new_2[i];
		}

		for (int i = K; i <= M; i++) {
			arr[i - 1] = new_1[i - K];
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

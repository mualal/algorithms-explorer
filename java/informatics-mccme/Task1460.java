import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task1460 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int K = in.nextInt();
		in.close();

		if (K > 0) {
			K = K % N;
			int[] new_1 = new int[K % N];
			for (int i = N - 1; i > N - 1 - K; i--) {
				new_1[N - 1 - i] = arr[i];
			}
			for (int i = N - 1; i >= K; i--) {
				arr[i] = arr[i - K];
			}
			for (int i = 0; i < K / 2; i++) {
				int temp = new_1[i];
				new_1[i] = new_1[K - 1 - i];
				new_1[K - 1 - i] = temp;
			}
			for (int i = 0; i < K; i++) {
				arr[i] = new_1[i];
			}
		}
		if (K < 0) {
			K = -K;
			K = K % N;
			for (int i = 0; i < K / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[K - i - 1];
				arr[K - i - 1] = temp;
			}
			for (int i = K; i < (N - K) / 2 + K; i++) {
				int temp = arr[i];
				arr[i] = arr[N - i + K - 1];
				arr[N - i + K - 1] = temp;
			}
			for (int i = 0; i < N / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[N - i - 1];
				arr[N - i - 1] = temp;
			}
		}
		PrintWriter output = new PrintWriter(new File("output.txt"));
		for (int i = 0; i < N; i++) {
			output.print(arr[i] + " ");
		}
		output.close();
	}
}

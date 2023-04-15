import java.util.Scanner;


public class Task112299 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int K = in.nextInt();
		int M = in.nextInt();
		int element_1 = M - K + 1;
		int[] arr_new = new int[element_1];
		for (int i = K - 1; i < M; i++) {
			arr_new[i - K + 1] = arr[i];
		}
		for (int i = 0; i < element_1 / 2; i++) {
			int time = arr_new[i];
			arr_new[i] = arr_new[element_1 - 1 - i];
			arr_new[element_1 - 1 - i] = time;

		}
		for (int i = K - 1; i < M; i++) {
			arr[i] = arr_new[i - K + 1];
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		in.close();
	}
}

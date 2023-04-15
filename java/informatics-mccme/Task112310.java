import java.util.Scanner;


public class Task112310 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int K = in.nextInt();
		int M = in.nextInt();
		int n = 0;
		in.close();
		for (int i = 0; i < N; i++) {
			if (arr[i] % K == 0 && arr[i] % M != 0 && arr[i] / 100 >= 1 && arr[i] / 100 < 10) {
				n++;
			}
		}
		if (n == 0) {
			System.out.println(0);
		} else {
			int k = 0;
			int[] arr_1 = new int[n];
			for (int i = 0; i < N; i++) {
				if (arr[i] % K == 0 && arr[i] % M != 0 && arr[i] / 100 >= 1 && arr[i] / 100 < 10) {
					arr_1[k] = arr[i];
					k++;
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.print(arr_1[i] + " ");
			}
		}
	}
}
